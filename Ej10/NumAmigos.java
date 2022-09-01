package Ej10;

import javax.swing.JOptionPane;

public class NumAmigos 
{
    public static void main(String[] args) 
    {
        int numero;
        int numero2;
        int z;
        int z2;

        z = 0;
        z2 = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        for(int i = 1 ; i <=numero ; i++)
        {
            if(numero%i==0)
            {
                z = z + i;
            }
        };
        for(int i = 1 ; i <=numero2 ; i++)
        {
            if(numero%i==0)
            {
                z2 = z2 + i;
            }
        }
        if (z == z2)
        {
            JOptionPane.showMessageDialog(null, "Los numeros: " + numero + " y " + numero2 + " Son Numeros amigos", "Numeros Amigos" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Los numeros: " + numero + " y " + numero2 + " no son Numeros amigos", "Numeros Amigos" , JOptionPane.INFORMATION_MESSAGE);
        };

        System.exit(0);
    }
}
