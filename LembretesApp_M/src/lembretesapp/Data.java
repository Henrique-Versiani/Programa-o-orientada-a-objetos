package lembretesapp;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
    public Data( int dia, int mes, int ano ){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMeses( int mes ) {
        return this.meses[mes - 1];
    }
    
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
}
