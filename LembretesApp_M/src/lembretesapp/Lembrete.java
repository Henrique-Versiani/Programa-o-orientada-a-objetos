package lembretesapp;

public class Lembrete implements Comparable<Lembrete> {
    private String descricao;
    private int dia;
    private int mes;
    private int ano;
    Data data = new Data(dia, mes, ano);
    
    public Lembrete( String descricao, Data data ){
        this.descricao = descricao;
        this.data = data;
    }
    
    public Data getData() {
        return data;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public String toString(){
        return "\n" + data + "-" + descricao;
    }

    @Override
    public int compareTo( Lembrete l ){
         if (this.data.getAno() != l.data.getAno()) {
            return this.data.getAno() - l.data.getAno();
        } else if (this.data.getMes() != l.data.getMes()) {
            return this.data.getMes() - l.data.getMes();
        } else {
            return this.data.getDia() - l.data.getDia();
        }
    }
}
