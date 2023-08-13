package aula_pratica03;

public class Data {
    private final int dia;
    private final int mes;
    private final int ano;
    private static final String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                                           "Julho", "Agosto","Setembro", "Outubro", "Novembro", "Dezembro"};
    public Data (int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String extenso(int i)
    {
        return meses[i - 1];
    }
    
    public int dia()
    {
        return dia;
    }
    
    public int mes()
    {
        return mes;
    }
    
    public int ano()
    {
        return ano;
    }
    
}
