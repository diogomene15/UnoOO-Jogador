# Jogador
## Setters
### Nome
Para alterar o nome do usuário, deve-se utilizar a função *`setNome(String nome)`*.
```java
Jogador jogador = new Jogador("");
jogador.setNome("Josefin Diotrovisk Karamazov"); //returns: (void)
```

### MaoCartas de jogador
Se houver a necessidade de atribuir um valor à mão do jogador, pode-se utilizar:
*`inicializarMao(ArrayList<Carta> cartasIniciais)`*.
```java
ArrayList<Carta> cartas = new ArrayList<>();
cartas.add(new CartaNormal(Cor.AZUL, 2));
Jogador jogador = new Jogador("Josefin Diotrovisk Karamazov");

jogador.inicializarMao(cartas); //returns: (void) // [!code focus]
```
::: info LEMBRE-SE
Também é possível definir o objeto de MaoCartas em jogador a
partir do construtor [*`Jogador(String nome, MaoCartas mao)`*](/jogador/docs/#com-nome-e-uma-maocartas-inicial).
:::