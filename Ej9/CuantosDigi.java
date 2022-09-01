package Ej9;

import javax.swing.JOptionPane;

public class CuantosDigi 
{
    public static void main(String[] args) 
    {
        int x;
        int z1;
        int z2;
        int z3;
        int z4;
        int z5;
        int n;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de X: "));
        n = 0;
        z1 = x % 10;
        z2 = (x % 100)/10;
        z3 = (x % 1000)/100;
        z4 = (x % 10000)/1000;
        z5 = (x % 100000)/10000;

        if ( z1%2 == 0)
        {
            n = n + 1;
        }
        if ( z2%2 == 0)
        {
            n = n + 1;
        }
        if ( z3%2 == 0)
        {
            n = n + 1;
        }
        if ( z4%2 == 0)
        {
            n = n + 1;
        }
        if ( z5%2 == 0)
        {
            n = n + 1;
        };
        JOptionPane.showMessageDialog(null, "Su numero: " + x + ", tiene " + n + " Digitos pares", "Digitos Pares" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
