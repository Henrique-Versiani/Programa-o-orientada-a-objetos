package lembretesapp;
import java.util.LinkedList;
import java.util.Scanner;

public class LembretesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainmenu;
        int data_dia, data_mes, data_ano, posicao;
        String descricao;
        BlocoDeLembretes bloco = new BlocoDeLembretes();
        
        for ( ;; ){
            mainmenu = menu();
            switch( mainmenu ){
                case 1:
                    System.out.println("\nInsira um lembrete: ");
                    descricao = scanner.nextLine();
                    System.out.println("\nInsira o dia do lembrete: ");
                    data_dia = scanner.nextInt();
                    System.out.println("\nInsira o mes do lembrete: ");
                    data_mes = scanner.nextInt();
                    System.out.println("\nInsira o ano do lembrete: ");
                    data_ano = scanner.nextInt();
                    bloco.inserirLembrete( new Lembrete(descricao, new Data(data_dia, data_mes, data_ano)));
                    bloco.ordenar();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("\nInforme a posição do lembrete que deseja apagar: ");
                    posicao = scanner.nextInt();
                    Lembrete removido = bloco.remover(posicao);
                    System.out.println("\nLembrete removido: " + removido);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println(bloco);
                    break;
                case 4:
                    System.out.println("\nInsira o mes que deseja buscar: ");
                    data_mes = scanner.nextInt();
                    System.out.println("\nInsira o ano que deseja buscar: ");
                    data_ano = scanner.nextInt();
                    scanner.nextLine();
                    LinkedList<Lembrete> bMes = bloco.buscarPorMes(data_mes, data_ano);
                    System.out.println(bMes);
                    break;
                case 5:
                    System.out.println("\nInsira o dia que deseja buscar: ");
                    data_dia = scanner.nextInt();
                    System.out.println("\nInsira o mes que deseja buscar: ");
                    data_mes = scanner.nextInt();
                    System.out.println("\nInsira o ano que deseja buscar: ");
                    data_ano = scanner.nextInt();
                    scanner.nextLine();
                    LinkedList<Lembrete> bDia = bloco.buscarPorDia(data_dia, data_mes, data_ano);
                    System.out.println(bDia);
                    break;
                case 6:
                    System.out.println("\nDigite uma substring");
                    descricao = scanner.nextLine();
                    LinkedList<Lembrete> SubS = bloco.buscarSubString(descricao);
                    System.out.println(SubS);
                    break;
                case 7:
                    System.out.println( "Fechando app de lembretes...");
                    System.exit(0);
            }
        }
    }
    
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        int escolha=0;
        do
        {
            System.out.println("### MENU ###");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir novo lembrete");
            System.out.println("2 - Excluir um lembrete");
            System.out.println("3 - Mostrar todos os lembretes");
            System.out.println("4 - Buscar lembretes de um determinado mes");
            System.out.println("5 - Buscar lembretes de um determinado dia");
            System.out.println("6 - Buscar por substring");
            System.out.println("7 - Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();
        } while ( escolha < 1 && escolha > 7 );
        return escolha;
    }
}
