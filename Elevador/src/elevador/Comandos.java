package elevador;

public class Comandos {
    private int andar_atual;
    private int capacidade;
    private int qtd_pessoas;
    private int total_andares;
    
    public void inicializa (int total_andares, int capacidade)
    {
        this.total_andares = total_andares;
        this.capacidade = capacidade;
        andar_atual = 0;
        qtd_pessoas = 0;
    }
    
    public void entra ()
    {
        if ( qtd_pessoas < capacidade )
            qtd_pessoas++;
        else
            System.out.println( "\nO elevador já atingiu o limite de sua capacidade\n");
    }
    
    public void sai ()
    {
        if ( qtd_pessoas != 0 )
            qtd_pessoas--;
        else
            System.out.println( "\nO elevador já está vazio\n");
    }
    
    public void sobe ()
    {
        if ( andar_atual < total_andares )
            andar_atual++;
        else
            System.out.println( "\nJá estamos no ultimo andar\n");
    }
    
    public void desce ()
    {
        if ( andar_atual > 0 )
            andar_atual--;
        else
            System.out.println( "\nAinda estamos no térreo\n");
    }
    
    public void imprimir ()
    {
        System.out.println( "\nAndar atual: " + andar_atual + "\nPessoas no elevador: " + qtd_pessoas );
    }
}
