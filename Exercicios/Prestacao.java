package Exercicios;

import javax.swing.JOptionPane;

public class Prestacao {
    public static void main(String[] args) {
        double installments = 5, value, total;

        value = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da venda: "));
        total = value / installments;

        JOptionPane.showMessageDialog(null, "Cada prestação fica " + total);

    }
}
