package atividadeaula;

public abstract class Funcionario {
    private double salario;
    
    public Funcionario ( double salario )
    {
        this.salario = salario;
    }
    
    @Override
    public String toString ()
    {
        return "Salario: " + salario;
    }
}
