package unoLikeGame;

public class TesteJogo {

	public static void main(String[] args) {
		Baralho baralho = new Baralho();
        Jogador jogador1 = new Jogador("Jogador 1", baralho.getMaoJogador1());
        Jogador jogador2 = new Jogador("Jogador 2", baralho.getMaoJogador2());

        // Exemplo de interação do jogador 1
        jogador1.pescar(baralho);
        jogador1.exibirMao();
        jogador1.jogarCarta(baralho);
        jogador1.exibirMao();

        // Exemplo de interação do jogador 2
        jogador2.pescar(baralho);
        jogador2.exibirMao();
        jogador2.jogarCarta(baralho);
        jogador2.exibirMao();
    }
}
