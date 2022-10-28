
# Jogador
## Getters

### Nome
É possível obter o nome do jogador a partir da função *`getNome()`*.
```java{3}
Jogador jogador = new Jogador("Arnaldo");
// [!code focus:3]
String nomeJogador = jogador.getNome();
System.out.printf("%s", nomeJogador); //returns: Arnaldo (String)
```
### Quantidade de cartas
Para obter a quantidade de cartas de um jogador, deve-se utilizar
a função *`getQuantidadeCartas()`*, que retorna o número de cartas a partir
de uma variável inteira.
```java
Jogador jogador1 = new Jogador("Neymar Jr");
jogador1.comprar(new CartaNormal(Cor.VERMELHO, 1));
jogador1.comprar(new CartaNormal(Cor.AZUL, 8));

System.out.printf("%d", jogador1.getQuantidadeCartas()); //returns: 2 (int) // [!code focus]
```