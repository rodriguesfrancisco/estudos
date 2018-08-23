package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.security.SecureRandom;

public class DeckDeCartas {
    private Carta[] deck;
    private int cartaAtual;
    private static final int NUMERO_DE_CARTAS = 52;

    private static final SecureRandom random = new SecureRandom();

    public DeckDeCartas() {
        String[] faces = {"Ás", "Duque", "Três", "Quatro", "Cinco", "Seis", "Sete",
                "Oito", "Nove", "Dez", "Valete", "Rainha", "Rei"};
        String[] suits = {"Copas", "Ouros", "Paus", "Espadas"};

        deck = new Carta[NUMERO_DE_CARTAS];
        cartaAtual = 0;

        for(int i = 0; i < deck.length; i++) {
            deck[i] = new Carta(faces[i % 13], suits[i / 13]);
        }
    }

    public void embaralhar(){
        cartaAtual = 0;

        for(int primeiro = 0; primeiro < deck.length; primeiro++){
            int segundo = random.nextInt(NUMERO_DE_CARTAS);

            Carta temp = deck[primeiro];
            deck[primeiro] = deck[segundo];
            deck[segundo] = temp;
        }
    }

    public Carta distribuiCarta() {
        if (cartaAtual < deck.length) {
            return deck[cartaAtual++];
        }else{
            return null;
        }
    }
}
