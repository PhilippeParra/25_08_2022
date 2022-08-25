package Ej4;

import javax.swing.JOptionPane;

public class Orden 
{
    public static void main(String[] args) 
    {
        int x;
        int y;
        int z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de y: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de z: "));

        if (x > y)
        {
            if (y > z)
            {
                JOptionPane.showMessageDialog(null,"El orden de los numeros es: \n" + z + "\n" + y+ "\n" + x, " Orden Ascendente" , JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El orden de los numeros es: \n" + y + "\n" + z + "\n" + x, " Orden Ascendente" , JOptionPane.INFORMATION_MESSAGE);
            }
            
        };
        if (y > x)
        {
            if (x > z)
            {
                JOptionPane.showMessageDialog(null,"El orden de los numeros es: \n" + z + "\n" + x + "\n" + y, " Orden Ascendente" , JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El orden de los numeros es: \n" + x + "\n" + z + "\n" + y, " Orden Ascendente" , JOptionPane.INFORMATION_MESSAGE);
            }
            
        };
        if (z > y)
        {
            if (x > y)
            {
                JOptionPane.showMessageDialog(null,"El orden de los numeros es: \n" + y + "\n" + x + "\n" + z, " Orden Ascendente" , JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El orden de los numeros es: \n" + x + "\n" + y + "\n" + z, " Orden Ascendente" , JOptionPane.INFORMATION_MESSAGE);
            }
            
        };
        
        System.exit(0);
    }
}
