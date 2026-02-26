package Exercicios;

import javax.swing.JOptionPane;

public class Peso {
    public static void main(String[] args) {
        double weight;

        weight = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null, "Qual o seu peso: "));
        
        JOptionPane.showMessageDialog(null, "Se voce tivesse 15% a mais de peso: " + (weight * 1.15));
        JOptionPane.showMessageDialog(null, "Se voce tivesse 15% a menos de peso: " + (weight * 0.85));
    }
}
