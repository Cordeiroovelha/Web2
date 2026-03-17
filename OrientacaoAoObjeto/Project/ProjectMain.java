package OrientacaoAoObjeto.Project;
import java.util.Scanner;

public class ProjectMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ProjectManager manager = new ProjectManager();


    private static int Menu() {
        System.out.println("=============================");
        System.out.println("===Controlador de Projetos===");
        System.out.println("=============================");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Visualizar todos");
        System.out.println("4 - Sair");
        return scanner.nextInt();
    }

    private static void view() {
        manager.viewAll();
        System.out.println("Aperte <enter> para continuar");
        scanner.nextLine();
    }


    private static void remove() {
        System.out.println("qual o Id: ");
        String id = scanner.nextLine();
        if(manager.remove(id)){
            System.out.println("projeto removido");
        }else
            System.out.println("projeto não encontrado");
    }


    private static void add() {
        System.out.println("Digite o nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite Id: ");
        String id = scanner.nextLine();
        Project product = new Project(name,id);
        if(manager.saveProject(product)){
            System.out.println("Projeto registrado");
            System.out.println(manager.getProjectList());
        }
        else
            System.out.println("Erro em registrar projeto");
    }

    public static void main(String[] args) {
        int opt;

        do {
            opt = Menu();
            scanner.nextLine();

            switch (opt) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    System.out.println("Até uma proxima!!");
                    break;
                default:
                    break;
            }

        } while (opt != 4);
        

        scanner.close();
    }

    
}
