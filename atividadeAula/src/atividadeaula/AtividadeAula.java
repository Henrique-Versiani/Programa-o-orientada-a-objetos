package atividadeaula;

public class AtividadeAula {

    public static void main(String[] args) {
        Funcionario supervisor = new Supervisor( 1234, 6500);
        Funcionario caixa = new Caixa( 4500);
        Funcionario estocadista = new Estocadista( 3500 );
        
        System.out.println ( "Autenticar supervisor ");
        if ((( Supervisor ) supervisor).autenticar(1234) )
            System.out.println ( "Supervisor autenticado" );
        else
            System.out.println ( "Senha incorreta" );
        
        System.out.println ( supervisor );
        System.out.println ( caixa );
        System.out.println ( estocadista );
    }
    
}
