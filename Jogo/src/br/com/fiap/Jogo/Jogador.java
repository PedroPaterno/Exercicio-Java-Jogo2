package br.com.fiap.Jogo;

public abstract class Jogador {
    protected String nome;
    protected int xp;
    protected int hp;
    protected boolean envenenado;

    public Jogador(String nome) {
        this.nome = nome;
        this.xp = 100;
        this.hp = 100;
        this.envenenado = false;
    }

    public abstract void atacar(Jogador jogador);

    public void receberDano(int pontos) {
        hp -= pontos;
        if (foiDerrotado()) {
            System.out.println("Game Over " + nome);
        }
    }

    public void receberCura(int pontos) {
        hp += pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void ganharExperiencia(int pontos) {
        xp += pontos;
    }

    public void receberAntidoto() {
        envenenado = !envenenado;
    }

    public boolean foiDerrotado() {
        return hp <= 0;
    }
}