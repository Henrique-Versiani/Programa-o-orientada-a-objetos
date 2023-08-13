package atividadeaula;

public class Estocadista extends Funcionario{
    public Estocadista ( double salario )
    {
        super ( salario );
    }
    
    @Override
    public String toString ()
    {
        return "Estocadista: " + super.toString();
    }
}
