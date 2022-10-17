// EXCLUIR ESTA CLASSE QUANDO FOR PERCEBIDA A INUTILIDADE DO CÓDIGO INTERNO
// (╯°□°)╯︵ ┻━┻
package base.jogador;

import java.util.ArrayList;
import base.Baralho;

import base.*;

public class MaoCartas extends Baralho{
    private ArrayList<Carta> cartas;
    public static final short tamInicial = 7;
    
    public void inicializar(ArrayList<Carta> cartasIniciais){
        this.cartas = cartasIniciais;
    }

    public void receberCarta(Carta carta){
        this.cartas.add(carta);
    }

    public int getQuantidadeCartas() {
        return this.cartas.size();
    }

    public MaoCartas(ArrayList<Carta> cartasIniciais){
        this.inicializar(cartasIniciais);
    }

}