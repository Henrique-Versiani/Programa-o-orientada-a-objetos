package exercicio3;

public class ControleRemoto {
    private Televisao tv;
    
    public ControleRemoto( Televisao tv )
    {
        this.tv = tv;
    }
    
    public void aumentaCh()
    {
        tv.AumentaCh();
    }
    
    public void diminuiCh()
    {
        tv.DiminuiCh();
    }
    
    public void aumentavol()
    {
        tv.Aumentavol();
    }
    
    public void diminuivol()
    {
        tv.Diminuivol();
    }
    
    public void trocar_canal( int novo_canal )
    {
        tv.Trocar_canal(novo_canal);
    }
    
    public void imprimir()
    {
        tv.Imprimir();
    }
}
