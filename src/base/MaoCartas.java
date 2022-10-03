package jogador;

import baralho.Carta;

public class MaoCartas {
    public static final tamInicial = 7;
    Carta[] cartas = new Carta[112];

    public MaoCartas(Cartas cartasIniciais[tamInicial]){
        for(int i=0; i<tamInicial; i++){
            this.maoCartas[i] = cartasIniciais[i];
        }
    }

    public void contaCartas() {
        
    }

    public Carta[] getCartas() {
        return cartas;
    }
}
