package atividadeaula;

public class Supervisor extends Funcionario implements Autenticavel{
    private int senha;
    
    public Supervisor ( int senha, double salario )
    {
        super ( salario );
        this.senha = senha;
    }
    
    @Override
    public boolean autenticar ( int senha )
    {
        if ( this.senha == senha )
            return true;
        return false;
    }
    
    @Override
    public String toString ()
    {
        return "Supervisor: " + super.toString();
    }
}
