package br.com.fiap.Jogo;

public class Dragao implements ElementoVisual {
    private int hp;

    public Dragao(int hp) {
        this.hp = hp;
    }

    public void atacar(Jogador jogador) {
        jogador.receberDano(hp);
        if (jogador.foiDerrotado()) {
            System.out.println("Jogador " + jogador.getNome() + " foi derrotado pelo dragão!");
        }
    }
}