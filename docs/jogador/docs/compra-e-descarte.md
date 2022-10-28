# Jogador
::: warning ATENÇÃO
Os comportamentos de compra e descarte podem mudar futuramente. Favor conferir documentação e [código do Github](https://github.com/diogomene15/UnoOO-Jogador/)
no caso de dúvidas.
:::
## Compra
Na classe jogador, as funções *`comprar`* se referem ao ato de receber uma carta.


### Comprar uma carta
Para fazer com que um jogador receba um carta específica, utilize a função *`comprar(Carta carta)`*.
```java
Jogador jogador = new Jogador("Rainer Maria Rilke");
jogador.comprar(new CartaNormal(Cor.VERMELHO, 9)); //returns: (void)
```
### Comprar várias cartas
Já no caso em que há a necessidade de se fazer com que Jogador receba várias cartas,
deve-se utilizar a função *`comprar(ArrayList<Carta> listaCartas)`*.
```java
ArrayList<Carta> cartas = new ArrayList<>(); // [!code focus]
cartas.add(new CartaNormal(Cor.VERMELHO, 9));
cartas.add(new CartaNormal(Cor.AZUL, 1));

Jogador jogador = new Jogador("Rainer Maria Rilke");
jogador.comprar(cartas); //returns: (void) // [!code focus]
```

## Descarte
Função que realiza o descarte (ou retirada) de carta de um objeto de Jogador.
:::danger CUIDADO
Função ainda não desenvolvida na classe Jogador
:::