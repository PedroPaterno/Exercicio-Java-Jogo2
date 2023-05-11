package br.com.fiap.Jogo;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Guerreiro("Joao", 0); 
		Jogador jogador2 = new Mago("Pedro", 0); 
		
		System.out.println("Jogador 2 " + jogador2.getNome() + 
							" XP=" + jogador2.getXp() +
							" HP=" + jogador2.getHp() +
							" Env=" + jogador2.isEnvenenado());
				
		Fase fase1 = new Fase();
		fase1.carregar(new Dragao(0));
		
		Fase fase2 = new Fase();
		fase2.carregar(new BolaDeFogo(0));
	}

	private static void mostrarJogador(Jogador jogador1) {
		System.out.println("Jogador 1 " + jogador1.getNome() + 
							" XP=" + jogador1.getXp() +
							" HP=" + jogador1.getHp() +
							" Env=" + jogador1.isEnvenenado()); 
	
	
						
	}
	
}