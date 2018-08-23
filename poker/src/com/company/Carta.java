package com.company;

public class Carta {
    private final String face;
    private final String suit;

    public Carta(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }

    @Override
    public String toString(){
        return face + " de " + suit;
    }
}
