package com.company;

public class Main {

    public static void main(String[] args) {
	    DeckDeCartas deckDeCartas = new DeckDeCartas();
	    deckDeCartas.embaralhar();

	    for(int i = 0; i <= 52; i++){
            System.out.printf("%-19s", deckDeCartas.distribuiCarta());

            if(i % 4 == 0){
                System.out.println();
            }
        }


    }
}
