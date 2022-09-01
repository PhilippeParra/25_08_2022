package Ej7_27_28;

import javax.swing.JOptionPane;

public class Whle 
{
    public static void main(String[] args) 
    {
    int x;
    int n;
    int z;

    x = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero: "));
    n = 0;
    z = 0;

    while(n != x)
    {
        z = (int)((x*(x+1))/2);
        n = n + 1;
    };
    
    JOptionPane.showMessageDialog(null, "la suma de los primeros " + x + " numeros es de: " + z, "While" , JOptionPane.INFORMATION_MESSAGE);

    }
}
