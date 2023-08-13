package atividadeaula;

public class Caixa extends Funcionario{
    
    public Caixa ( double salario )
    {
        super( salario );
    }
    
    public void RemoveItem ( int item )
    {
        System.out.println( "Esta funcionalidade precisa ser implementada.");
    }
    
    @Override
    public String toString ( )
    {
        return "Salario caixa: " + super.toString();
    }
}
