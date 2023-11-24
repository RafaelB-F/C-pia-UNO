package unoLikeGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<String> cartas;
    private List<String> maoJogador1;
    private List<String> maoJogador2;
    private List<String> montePesca;
    private List<String> mesa;

    public Baralho() {
        this.cartas = new ArrayList<>();
        this.maoJogador1 = new ArrayList<>();
        this.maoJogador2 = new ArrayList<>();
        this.montePesca = new ArrayList<>();
        this.mesa = new ArrayList<>();

        // Adicionar cartas ao baralho
        String[] naipes = {"Espadas", "Copas", "Paus", "Ouros"};

        for (String naipe : naipes) {
            for (int valor = 1; valor <= 13; valor++) {
                String carta = valor + " de " + naipe;
                this.cartas.add(carta);
            }
        }

        // Embaralhar o baralho
        Collections.shuffle(this.cartas);

        // Distribuir mãos de jogadores
        distribuirMaos();

        // Criar monte de pesca
        montePesca();
    }

    private void distribuirMaos() {
        for (int i = 0; i < 14; i++) {
            if (i % 2 == 0) {
                maoJogador1.add(cartas.get(i));
            } else {
                maoJogador2.add(cartas.get(i));
            }
        }
    }

    private void montePesca() {
        for (int i = 14; i < cartas.size(); i++) {
            montePesca.add(cartas.get(i));
        }
    }

    public void exibirMaoJogador1() {
        System.out.println("Mão do Jogador 1:");
        for (String carta : maoJogador1) {
            System.out.println(carta);
        }
    }

    public void exibirMaoJogador2() {
        System.out.println("\nMão do Jogador 2:");
        for (String carta : maoJogador2) {
            System.out.println(carta);
        }
    }

    public void exibirMontePesca() {
        System.out.println("\nMonte de Pesca:");
        for (String carta : montePesca) {
            System.out.println(carta);
        }
    }

    public List<String> getMaoJogador1() {
        return maoJogador1;
    }

    public List<String> getMaoJogador2() {
        return maoJogador2;
    }

    public void jogarCartaNaMesa(String carta) {
        mesa.add(carta);
    }

    public String pescarCarta() {
        if (!montePesca.isEmpty()) {
            String cartaPescada = montePesca.remove(0);
            return cartaPescada;
        } else {
            System.out.println("Monte de pesca vazio. Não é possível pescar.");
            return null;
        }
    }
}