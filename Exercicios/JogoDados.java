package Exercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class JogoDados {
    public static void main(String[] args) {
        Random NumberGenerator = new Random();

        int face1, face2, add, trys, option, bet;
        boolean gotIt;

        do{
            trys = 3;
            gotIt = false;
            face1 = NumberGenerator.nextInt(6) + 1; // ele nunca chega no limite (nesse caso 6) por isso add 1
            face2 = NumberGenerator.nextInt(6) + 1;

            add = face1 + face2;
            // para teste
            System.out.println("face 1: " + face1 + " - face 2: " + face2 + " - soma " + add); // atalho sysout

            while(!gotIt && trys > 0){
                trys--;
                bet = Integer.parseInt(JOptionPane.showInputDialog(null, "faça sua aposta"));

                if(bet == add){
                    gotIt = true;
                } else {
                JOptionPane.showMessageDialog(null, "voce tem mais " + trys + " tentativas");
                }
            }

            if(gotIt){
                JOptionPane.showMessageDialog(null, "parabens! voce acertou");
            } else {
                JOptionPane.showMessageDialog(null, "A casa sempre granha!");
            }

            option = JOptionPane.showConfirmDialog(null, "Quer tentar denovo?");
        }while(option == 0);

    }
}
