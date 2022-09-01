package Ej8;

import javax.swing.JOptionPane;

public class for1 
{
    public static void main(String[] args) 
    {
        int n;
        int suma;
        suma = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero: "));

        for (int i=1 ; i<=n ; i ++)
        {
            suma = suma + i;
        };

        JOptionPane.showMessageDialog(null, "la suma de los primeros " + n + " numeros es de: " + suma , "For" , JOptionPane.INFORMATION_MESSAGE);
    }   
}
