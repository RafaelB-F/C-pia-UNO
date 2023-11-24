package unoLikeGame;

import java.util.List;
import java.util.Scanner;

public class Jogador {
    private String nome;
    private List<String> mao;

    public Jogador(String nome, List<String> mao) {
        this.nome = nome;
        this.mao = mao;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getMao() {
        return mao;
    }

    public void pescar(Baralho baralho) {
        String cartaPescada = baralho.pescarCarta();
        if (cartaPescada != null) {
            mao.add(cartaPescada);
            System.out.println(nome + " pescou a carta: " + cartaPescada);
        } else {
            System.out.println("Monte de pesca vazio. Não é possível pescar.");
        }
    }

    public void jogarCarta(Baralho baralho) {
        exibirMao();
        System.out.println("Escolha a carta para jogar (digite o nome da carta): ");
        Scanner scanner = new Scanner(System.in);
        String cartaEscolhida = scanner.nextLine();

        if (mao.contains(cartaEscolhida)) {
            mao.remove(cartaEscolhida);
            baralho.jogarCartaNaMesa(cartaEscolhida);
            System.out.println(nome + " jogou a carta: " + cartaEscolhida);
        } else {
            System.out.println(nome + " não tem a carta " + cartaEscolhida + " na mão.");
        }
    }

    public void exibirMao() {
        System.out.println("\nMão de " + nome + ":");
        for (String carta : mao) {
            System.out.println(carta);
        }
    }
}