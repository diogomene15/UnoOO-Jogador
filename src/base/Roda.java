package base;

import java.util.ArrayList;
import base.cartas.*;
import base.jogador.*;

public class Roda {
	Baralho compra;
	Baralho descarte = new Baralho(Baralho.NORMAL);

            
	ArrayList<Jogador> jogadores;

	private int sentido;

    private int posicaoAtual;
	/**
	 * Método construtor: 
     * Cria o "monte de compra" e determina uma sequência para os jogadores
     * Distribui sete cartas para cada jogador.
     * Define a primeira carta do monte de descarte para que o jogo possa ser de fato inicializado.
     * Verifica se a primeria carta do monte de descarte é numérica e com cor.
	 * @param recebido Baralho inicial recebido pelo jogo
	 * @param jogadoresRecebidos ArrayList<Jogador> recebido pelo jogo
	 */
    public Roda(Baralho recebido, ArrayList<Jogador> jogadoresRecebidos){
	  compra = recebido;
      jogadores = jogadoresRecebidos;
	 for(int i = 0; i < jogadores.size(); i ++){
         for(int j = 0; j < 7; j++){
		    //jogadores.get(i).comprarCarta(compra.comprarCarta());
         }
	   }
	//  do{
	//     descarte.receberCarta(compra.comprarCarta());
	//  }while(descarte.ultimaCarta().getAcao() != "Esta carta não possui ação"); COMENTADO POR FALTA DE INFORMAÇÕES PARA REMODELAGEM -GRUPO JOGADOR/MAOJOGADOR/JOGADA (método ainda não realizado)
     
   }

  	/**
	   * Insere uma carta no monte de descarte.
	   * @param recebida Carta recebida para inserir no monte de descarte
	   */
	public void descartarCarta(Carta recebida) {
	  descarte.receberCarta(recebida);
	}
  
	/**
	 * 
	 * @return Primeira carta do monte de compra
	 */
    public Carta entregarCarta(){
        if(compra.getCartas().size() < 1){
            transformaDescarte();
        }
        return compra.comprarCarta();
    }


	public void transformaDescarte() {
        for(int i = 0; i < descarte.getCartas().size()-1; i++){
            compra.receberCarta(descarte.comprarCarta());
        }
        compra.embaralhar();
	}



	/**
	 * Altera o sentido do jogo(horário e anti-horário)
	 */
	public void inverter() {
        sentido *= -1;
	}



	/**
     * Verifica se a posição atual não extrapola o tamanho do vetor de jogadores
     * @param i Posição atual
     * @return Índice do próximo jogador 
     */
	public int proximo(int i) {
      int x = i + sentido;  
      if(x > jogadores.size()){
          x = x - jogadores.size();
      }
      if(x < 0){
          x = x + jogadores.size();
      }
      return x;
	}

    /**
     * Método chamado pela classe ação para informar que pulou um jogador
     */
    public void pular(){
        sentido *= 2;
    }

  
	/**
     * @param jogadorRecebido Jogador
     * @return Posição do jogador na roda
     */
	public Jogador jogadorDaVez() {
        int i = 0;
        // while( != jogadores.get(i)){ COMENTADO POR FALTA DE INFORMAÇÕES PARA REMODELAGEM -GRUPO JOGADOR/MAOJOGADOR/JOGADA
        //     i++;
        // } 
        i = proximo(i);
        if(sentido % 2 == 0){
            sentido /= 2;
        }
        return jogadores.get(i);   
    }



    public Carta getUltimaCarta(){
        return this.descarte.ultimaCarta();
    }

    public void comprar(int qtd, Jogador jogador){
        for(int i =0; i<qtd; i++){
            jogador.comprar(compra.comprarCarta());
        }
    }

  }