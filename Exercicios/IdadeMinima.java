package Exercicios;
import javax.swing.JOptionPane;

public class IdadeMinima {
    public static void main(String[] args) {
		
		int minimunAge = 18;
		int age;
		
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a Idade?"));
		if(age >= minimunAge)
			JOptionPane.showMessageDialog(null, "Maior de idade");
		else
			JOptionPane.showMessageDialog(null, "Menor de idade");
		
	}
}
