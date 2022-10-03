package jogador;

public class Jogador {

    private String nome;
    private MaoCartas maoCartas = new MaoCartas();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public MaoCartas getMaoCartas() {
        return maoCartas;
    }
    public void setMaoCartas(MaoCartas maoCartas) {
        this.maoCartas = maoCartas;
    }

    public Jogador(String nome, MaoCartas maoInicial){
        this.nome = nome.toLowerCase().trim();
        this.maoCartas = maoInicial;
    }

}
