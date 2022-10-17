package base.jogador;

import java.util.ArrayList;
import base.*;

public class Jogador implements jogada{

    private String nome;
<<<<<<< HEAD
=======
    //private MaoCartas maoCartas;
>>>>>>> fe8d05f168bb1ffbcfc4a2698595bafa7acb9442

    ArrayList<Carta> maoJogador = new ArrayList<Carta>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
    *
    * Inicializa a lista maoJogador, comprando 7 cartas
    *
    **/
    private void inicialzarMao(){
        comprar(7);
    }

    /**
    *
    * Compra uma carta, adicionando uma carta a MaoJogador,
    * retirando-a do monte de compras
    *
    **/
    @Override
    public void comprar(int quant){
        for(int i = 0; i<quant; i++){
            //maojogador.add(carta do topo do monte de compras)
            // Retirar carta do topo do monte de compras
        }
    }

     /**
    *
    * Descarta uma carta, retirando uma carta a MaoJogador,
    * adicionando-a ao monte de descarte
    *
    **/
    @Override
    public void descartar(){
        //
    }

    public Jogador(String nome, MaoCartas maoInicial){
        this.nome = nome.toLowerCase().trim();
        this.inicialzarMao();
    }
    public Jogador(String nome){
        this.nome = nome.toLowerCase().trim();
    }

}
