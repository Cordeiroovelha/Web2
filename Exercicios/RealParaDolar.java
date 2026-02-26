package Exercicios;

import java.util.Scanner;

public class RealParaDolar {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        double real, dolar, exchangeRate = 5.25;

        System.out.print("Quantos reais voce tem hoje? ");
        real = keybord.nextDouble();
        dolar = real / exchangeRate;
        System.out.printf("Voce tem %.2f dolares%n", dolar); // %.2f para formatar duas casas decimais
        // %n para quebra de linha no printf
        System.out.println("A cotação hoje é: " + exchangeRate);

        keybord.close();
    }
}
