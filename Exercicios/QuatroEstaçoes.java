package Exercicios;

import javax.swing.JOptionPane;

public class QuatroEstaçoes {
    public static void main(String[] args) {
		
		String mouth;
		
		mouth = JOptionPane.showInputDialog(null, "Qual o mes voce quer buscar?");
		
		switch (mouth) {
		case "janeiro": {
			JOptionPane.showMessageDialog(null, "Verão");
			break;
		}
		case "fevereiro": {
			JOptionPane.showMessageDialog(null, "Verão");
			break;
		}
		case "março": {
			JOptionPane.showMessageDialog(null, "outono");
			break;
		}
		case "abril": {
			JOptionPane.showMessageDialog(null, "outono");
			break;
		}
		case "maio": {
			JOptionPane.showMessageDialog(null, "outono");
			break;
		}
		case "junho": {
			JOptionPane.showMessageDialog(null, "inverno");
			break;
		}
		case "julho": {
			JOptionPane.showMessageDialog(null, "inverno");
			break;
		}
		case "agosto": {
			JOptionPane.showMessageDialog(null, "inverno");
			break;
		}
		case "setembro": {
			JOptionPane.showMessageDialog(null, "primavera");
			break;
		}
		case "outubro": {
			JOptionPane.showMessageDialog(null, "primavera");
			break;
		}
		case "novembro": {
			JOptionPane.showMessageDialog(null, "primavera");
			break;
		}
		case "dezembro": {
			JOptionPane.showMessageDialog(null, "Verão");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "escrito errado ou mes invalido");
			break;
		}
		
		
	}
}
