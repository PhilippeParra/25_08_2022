package clase1;

import javax.swing.JOptionPane;

public class InstRep
{
    public static void main(String[] args) 
    {
        //Declaracion de variables
        int x;
        int y;
        

        //Input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de y: "));

        //Processing
        if (x < y)
        {
            JOptionPane.showMessageDialog(null, "Entre los dos numeros dados " + x + " es menor que "  + y, "Numero mayor" , JOptionPane.INFORMATION_MESSAGE);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Entre los dos numeros dados " + y + " es menor que "  + x, "Numero mayor" , JOptionPane.INFORMATION_MESSAGE);
        };

        //Output
        

        //end
        System.exit(0);
    }
}