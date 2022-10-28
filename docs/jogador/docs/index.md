# Jogador

## Construtores

Há dois modos de inicializar um objeto da classe Jogador:
### Com nome
Para isso basta utilizar *`Jogador(String nome)`*.
<br>
**Exemplo:**
```java
Jogador jogador = new Jogador("Bernaldo");
```

### Com nome e uma MaoCartas inicial
Pode-se utilizar o formato *`Jogador(String nome, MaoCartas mao)`*.
<br>
**Exemplo:**
```java
Jogador jogador = new Jogador("Bernaldo", new MaoCartas());
```