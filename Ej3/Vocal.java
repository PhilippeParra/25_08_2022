package Ej3;

import javax.swing.JOptionPane;

public class Vocal
{
    public static void main(String[] args) 
    {
        char x;

        x = (JOptionPane.showInputDialog("Digite la letra a evaluar: ")).charAt(0);

        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
        {
            JOptionPane.showMessageDialog(null, "La letra " + x + " es vocal ", "Vocales" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La letra " + x + "\nNo es vocal", "Vocales" , JOptionPane.INFORMATION_MESSAGE);
        };

        System.exit(0);

    }
}
