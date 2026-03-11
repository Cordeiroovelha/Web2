package OrientacaoAoObjeto;

import java.util.Scanner;

public class ProductControlMain {
    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("---- Controle de produtos ----");
        System.out.println("-------------Menu-------------");
        System.out.println("------------------------------");

        System.out.println("Opções");
        System.out.println("1- Registro de novo produto");
        System.out.println("2- modificar dados de produto");
        System.out.println("------------------------------");
        System.out.println("Selecione uma opçao: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int option;
        option = menu();
        switch (option) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }

    
}
