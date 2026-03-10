package OrientacaoAoObjeto;

import java.util.Scanner;

public class PeopleControlMain {
    
    public static int menu(){
        private static Scanner keybord = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("-- People Manager System --");
        System.out.println("---------------------------");
        System.out.println("------- Option Menu -------");
        System.out.println("1 - Sign In");
        System.out.println("2 - Search Id");
        System.out.println("3 - Refresh");
        System.out.println("4 - Remove");
        System.out.println("5 - Exist ");
        return keybord.nextInt();
    }

    public static void main(String[] args) {
        int option;

        do {
            option = menu();
        } while (option != 5);
    }
}
