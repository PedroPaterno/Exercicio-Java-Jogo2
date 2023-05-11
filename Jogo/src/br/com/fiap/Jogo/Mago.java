package br.com.fiap.Jogo;

public class Mago extends Jogador {
    private int poderMagico;

    public Mago(String nome, int poderMagico) {
        super(nome);
        this.poderMagico = poderMagico;
    }

    public void atacar(Jogador jogador) {
        BolaDeFogo bolaDeFogo = new BolaDeFogo(poderMagico);
        bolaDeFogo.atacar(jogador);
    }
}