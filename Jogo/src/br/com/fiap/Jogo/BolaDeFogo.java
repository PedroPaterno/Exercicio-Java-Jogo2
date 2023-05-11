package br.com.fiap.Jogo;

public class BolaDeFogo implements ElementoVisual {
    private int poderMagico;

    public BolaDeFogo(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public void atacar(Jogador jogador) {
        jogador.receberDano(poderMagico);
        if (jogador.foiDerrotado()) {
            System.out.println("Jogador " + jogador.getNome() + " foi derrotado pela bola de fogo!");
        }
    }
}