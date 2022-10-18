package base;

import java.util.ArrayList;
import java.util.Scanner;
import base.jogador.*;

/**
 * @author Autores: Daniel Schutz, Felipe Pellissari, Fernanda Pessoa e José Lucas.
*Classe destinada a inicializar a partida e verificar seu término, bem como
*preparar o jogo - instanciando o baralho inicial, jogadores e passando estes por
*parâmero a classe 'Roda'
*/
public class Jogo{

    private Baralho baralho;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private Roda roda;
    private int numeroJogadores;


    
    /**
    *Inicia o Baralho, lendo número de jogadores em 'numeroJogadores' e
    *lendo o nome dos jogadores em 'nome', passando por parâmetro para a classe Jogador
    *passando por parâmetro para a classe Roda(baralho, jogador)
    *@see Baralho.java
    *@see Jogador.java
    *@see Roda.java
    */
    public void prepararJogo()
    {
        /**Inicia o baralho*/
        this.baralho = new Baralho(Baralho.INICIAL);

        /**definir quantidade de  jogadores*/
        System.out.println("Quantos jogadores?\n");
        Scanner sc = new Scanner(System.in);
        this.numeroJogadores = sc.nextInt();

        /**instanciar jogadores*/
        for(int i=0; i<numeroJogadores; i++)
        {
            String nome = sc.nextLine();
            this.jogadores.add(new Jogador(nome));

        }

        /**instanciar a roda e mandar baralho e lista de jogadores*/
        roda = new Roda(this.baralho, this.jogadores);
    }

    // public int confereFim(){
    //     if(true){ //COLOCADO TRUE POIS NÃO HAVIA CONTEXTO SUFICIENTE PARA REMODELAGEM - GRUPO JOGADOR/MAOJOGADOR/JOGADA
    //         return 0;
    //     } else {
    //         return 1;
    //     }
    // }
    
    // while(confereFim()){
    //     // jogarCarta();//criar função para jogar carta
    //     // execAcao(); //executar a ação da carta
    //     // confereFim();//verificar se o jogador[i] ficou sem cartas
    //     // proxJogador();//mudar pro proximo jogador

    // }
    // System.out.print("O jogador %s ganhou.",jogadores[i]);
    

}