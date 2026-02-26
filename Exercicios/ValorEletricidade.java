package Exercicios;

import java.util.Scanner;

public class ValorEletricidade {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        double consumption, valuePerKwh, total;

        System.out.println("Qual o valor do Kwh ...........: ");
        valuePerKwh = keybord.nextDouble();
        System.out.println("Quantos Kwh foram consumidos ..: ");
        consumption = keybord.nextDouble();

        total = consumption * valuePerKwh;

        System.out.println("O valor total a ser pago é .....: " + total);
        System.out.printf("Com 15% de desconto fica .......: %.2f" , (total - (total * 0.15)));

        keybord.close();
    }
}
