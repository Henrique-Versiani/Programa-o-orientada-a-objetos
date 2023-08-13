package lembretesapp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BlocoDeLembretes {
    private List<Lembrete> lista;
    
    public BlocoDeLembretes(){
        lista = new LinkedList<>();
    }
    
    public void inserirLembrete(Lembrete l){
        lista.add(l);
    }
    
    public Lembrete remover( int posicao ){
        return lista.remove(posicao);
    }
    
    public Lembrete buscar( int posicao ){
        return lista.get(posicao);
    }
    
    public LinkedList<Lembrete> buscarPorDia( int dia, int mes, int ano ){
        LinkedList<Lembrete> bDia = new LinkedList<>();
        for(Lembrete lembrete: lista){
            if ( lembrete.getData().getAno() == ano && lembrete.getData().getMes() == mes && lembrete.getData().getDia() == dia )
                bDia.add(lembrete); 
        }
        return bDia;
    }
    
    public LinkedList<Lembrete> buscarPorMes( int mes, int ano ){
        LinkedList<Lembrete> bMes = new LinkedList<>();
        for(Lembrete lembrete: lista){
            if ( lembrete.getData().getAno() == ano && lembrete.getData().getMes() == mes )
                bMes.add(lembrete); 
        }
        return bMes;
    }
    
    public LinkedList<Lembrete> buscarSubString( String texto ){
        LinkedList<Lembrete> SubS = new LinkedList<>();
        for(Lembrete lembrete: lista){
            if ( lembrete.getDescricao().contains(texto) )
                SubS.add(lembrete); 
        }
        return SubS;
    }
    
    public void ordenar() {
        Collections.sort(lista);
    }
    
    @Override
    public String toString(){
        return lista.toString();
    }
}
