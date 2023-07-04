package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int mainmenu;
        Scanner scanner = new Scanner(System.in);
        Televisao tv = new Televisao();
        ControleRemoto c = new ControleRemoto(tv);
        
        for ( ;; ){
            mainmenu = menu();
            switch( mainmenu ){
                case 1:
                    c.aumentaCh();
                    c.imprimir();
                    break;
                case 2:
                    c.diminuiCh();
                    c.imprimir();
                    break;
                case 3:
                    c.aumentavol();
                    c.imprimir();
                    break;
                case 4:
                    c.diminuivol();
                    c.imprimir();
                    break;
                case 5:
                    System.out.println( "\nDigite um canal: "); 
                    int canal = scanner.nextInt();
                    c.trocar_canal(canal);
                    c.imprimir();
                    break;
                case 6:
                    System.out.println( "Desligando a televisao ... ");
                    System.exit(0);
            }
        }
        
    }
    
    public static int menu()
    {
        Scanner scanner = new Scanner(System.in);
        int escolha=0;
        do
        {
            System.out.println( "--------- MENU ---------");
            System.out.println( "\n1: Próximo canal"
                                + "\n2: Canal anterior"
                                + "\n3: Aumentar volume"
                                + "\n4: Diminuir volume"
                                + "\n5: Trocar canal"
                                + "\n6: Desligar televisao");
            escolha = scanner.nextInt();
        } while ( escolha < 1 && escolha > 6 );
        return escolha;
    
}
}
