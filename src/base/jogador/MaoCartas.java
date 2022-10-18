// EXCLUIR ESTA CLASSE QUANDO FOR PERCEBIDA A INUTILIDADE DO CÓDIGO INTERNO
// (╯°□°)╯︵ ┻━┻
package base.jogador;

import java.util.ArrayList;
import base.Baralho;
import base.cartas.Carta;


public class MaoCartas extends Baralho{
    private ArrayList<Carta> cartas;
    public static final short tamInicial = 7;
    
    /**
     * Realiza a inicialização do objeto de MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais de MaoCartas
     */
    private void inicializar(ArrayList<Carta> cartasIniciais){
        this.cartas = cartasIniciais;
    }

    /**
     * Realiza a adição de uma carta na lista de cartas
     * atuais no objeto de MaoCartas
     * @param carta - Carta a ser adicionada em MaoCartas
     */
    public void receberCarta(Carta carta){
        this.cartas.add(carta);
    }
    /**
     * Retorna a quantidade atual de cartas na lista de cartas
     * de MaoCartas
     * @return
     */
    public int getQuantidadeCartas() {
        return this.cartas.size();
    }
    /**
     * Construtor que recebe uma lista inicial de cartas para
     * a MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais para MaoCartas
     */
    public MaoCartas(ArrayList<Carta> cartasIniciais){
        super(Baralho.NORMAL);
        this.inicializar(cartasIniciais);
    }
    /**
     * Construtor que retorna uma MaoCartas totalmente vazia
     * (sem cartas).
     */
    public MaoCartas(){
        super(Baralho.NORMAL);
    }

}