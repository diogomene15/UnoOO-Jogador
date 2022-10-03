package jogador;

public class Jogador {
    String nome;
    MaoCartas maoCartas = new MaoCartas();
    public Jogador(String nome; MaoCartas maoInicial){
        this.nome = nome.toLowerCase().trim();
        this.maoCartas = maoInicial;
    }
    public void jogarCarta() {
        
    }

    public void comprarCarta() {
        return;
        
    }
}
