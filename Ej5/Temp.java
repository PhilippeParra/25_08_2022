package Ej5;

import javax.swing.JOptionPane;

public class Temp 
{
    public static void main(String[] args) 
    {
        int t;

        t = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la Temperatura: "));

        if (t < 10)
        {
            JOptionPane.showMessageDialog(null, "Su clima actual es: Frio", "Temperatura" , JOptionPane.INFORMATION_MESSAGE);
        };
        if (10 <= t && t <= 20)
        {
            JOptionPane.showMessageDialog(null, "Su clima actual es: Nublado", "Temperatura" , JOptionPane.INFORMATION_MESSAGE);
        };
        if (21 < t && t < 30)
        {
            JOptionPane.showMessageDialog(null, "Su clima actual es: Calor", "Temperatura" , JOptionPane.INFORMATION_MESSAGE);
        };
        if (t > 31)
        {
            JOptionPane.showMessageDialog(null, "Su clima actual es: Tropical", "Temperatura" , JOptionPane.INFORMATION_MESSAGE);
        };

        System.exit(0);
    }   
}
