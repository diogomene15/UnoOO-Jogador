package base;
import base.cartas.*;
import java.util.ArrayList;
import java.util.Collections;

import base.Acao.Mais4;


/**
 * Representa a abstração de um conjunto de cartas
 * 
 * @author luciano.silva
 *
 */
public class Baralho {
	public static final boolean NORMAL = false;
	public static final boolean INICIAL = true;

	private ArrayList<Carta> cartas = new ArrayList<>();
	private boolean tipo;

	// private Carta[] baralho = new Carta[112];

	/**
	 * 
	 * @param tipo Baralho.INICIAL se for baralho inicial, ou Baralho.Normal para os
	 *             demais tipos de baralho.
	 */
	public Baralho(boolean tipo) {
		this.tipo = tipo;
		if (tipo == Baralho.INICIAL) {
			gerarCartas();
			embaralhar();
		}

	}

	/**
	 * Esse método somente será chamado quando o baralho criado for do tipo inicial.
	 */
	public void gerarCartas() {
		ArrayList<Cor> cores = new ArrayList<Cor>();

    		cores.add(Cor.AZUL);
    		cores.add(Cor.AMARELO);
    		cores.add(Cor.VERMELHO);
    		cores.add(Cor.AZUL);

    	int i = 0;
    	for (int j = 0; j < 4; j++) {
      	for (int k = 0; k < 2; k++) {
        for (int n = 0; n <= 9; n++) {
          cartas.add(new CartaNormal(cores.get(i), n));
        }

        cartas.add(new CartaEspecialComCor(cores.get(j), Carta.MAIS2));
        cartas.add(new CartaEspecialComCor(cores.get(j), Carta.INVERTE));
        cartas.add(new CartaEspecialComCor(cores.get(j), Carta.BLOQ));
      }

      	cartas.add(new CartaEspecialSemCor(new Mais4()));
      	cartas.add(new CartaEspecialSemCor(new Mais4()));

      	i++;
    }
  }

	public void embaralhar() {
		Collections.shuffle(cartas);

	}

	/**
	 * @deprecated quem distribui é a roda, excluir este método
	 */
	public void distribuir() {
	}

	/**
	 * 
	 * @return a primeira carta do baralho
	 */
	public Carta comprarCarta() {
		return this.cartas.remove(0);
	}

	/**
	 * 
	 * @param c
	 */
	public void receberCarta(Carta c) {
		this.cartas.add(c);
	}

	public int quantCarta() { // para verificar a quantidade de cartas
		return this.cartas.size();
		
	}

  	public Carta ultimaCarta() { // para verificar a última carta
  		Carta ultima = cartas.get(quantCarta()-1);
		//System.out.println(ultima.getNumero() +" "+ultima.getCor()+" "+ultima.getAcao());
		return ultima;
		}

	/**
	 * @return the baralho
	 */
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the baralho to set
	 */
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	/**
	 * @return the tipo
	 */
	public boolean isTipo() {
		return tipo;
	}

}