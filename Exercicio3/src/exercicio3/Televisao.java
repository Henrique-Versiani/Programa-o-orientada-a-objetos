/*Exercício 3: Crie uma classe Televisao e uma classe ControleRemoto que pode
controlar o volume e trocar os canais da televisão. O controle de volume permite:
● aumentar ou diminuir a potência do volume de som em uma unidade de cada
vez;
● aumentar e diminuir o número do canal em uma unidade;
● trocar para um canal indicado;
● consultar o valor do volume de som e o canal selecionado.*/
package exercicio3;

public class Televisao {
    private int canal = 0;
    private int volume = 0;
    private final int volume_maximo = 100;
    private final int ultimo_canal = 110;
    
    public void AumentaCh()
    {
        if ( canal < ultimo_canal )
            canal++;
        else
            canal = 0;
    }
    
    public void DiminuiCh()
    {
        if ( canal > 0 )
            canal--;
        else
            canal = ultimo_canal;
    }
    
    public void Aumentavol()
    {
        if ( volume < volume_maximo )
            volume++;
        else
            System.out.println( "\nO volume já está no máximo\n");
    }
    
    public void Diminuivol()
    {
        if ( volume > 0 )
            volume--;
        else
            System.out.println( "\nO volume já está no mínimo\n");
    }
    
    public void Trocar_canal( int novo_canal )
    {
        if ( novo_canal >= 0 && novo_canal <= 110 )
            canal = novo_canal;
        else
            System.out.println( "\nCanal inválido\n");
    }
    
    public void Imprimir()
    {
        System.out.println( "\nCanal: " + canal + "\nVolume: " + volume);
    }
}
