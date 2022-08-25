package Ej2;

import javax.swing.JOptionPane;

public class Multiplo 
{
    public static void main(String[] args) 
    {
        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));

        if (x%5 == 0 && x%3 == 0)
        {
           JOptionPane.showMessageDialog(null, "El numero " + x + " es multiplo de 3 y 5 ", "Multiplo" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero dado " + x + " no es multiplo de 3 y 5", "Multiplo" , JOptionPane.INFORMATION_MESSAGE);
        };

        System.exit(0);
    }
}
