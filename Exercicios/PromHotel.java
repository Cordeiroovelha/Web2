package Exercicios;

import java.util.Scanner;

public class PromHotel {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        double day, promotion, total;

        System.out.print("Digite o valor da diaria: ");
        day = keybord.nextDouble();
        System.out.print("Digite a procentagem da promoção: ");
        promotion = keybord.nextDouble();

        total = day - (day * (promotion / 100));

        System.out.println("O valor total da promoção é: " + total);

        keybord.close();
    }
}
