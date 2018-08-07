package com.company;

public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Peca pecaInsere = new Peca();

        pilha.insere(pecaInsere);
        Object pecaRemove = pilha.remove();

        if(pilha.vazia()){
            System.out.println("A pilha está vazia.");
        }
    }
}
