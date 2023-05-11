package br.com.fiap.Jogo;
public class Guerreiro extends Jogador {
    private int forca;

    public Guerreiro(String nome, int forca) {
        super(nome);
        this.forca = forca;
    }

    public void atacar(Jogador jogador) {
        jogador.receberDano(forca);
        if (jogador.foiDerrotado()) {
            ganharExperiencia(jogador.getXp());
        }
    }
}