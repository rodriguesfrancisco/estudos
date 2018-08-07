package com.company;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        Aluno a2 = new Aluno();
        a2.setNome("Anna");
        Aluno a3 = new Aluno();
        a3.setNome("Francisco");

        ListaLigada lista = new ListaLigada();
        lista.adiciona(a1.getNome());
        lista.adiciona(a2.getNome());
        lista.adiciona(a3.getNome());

        ListaLigada lista2 = new ListaLigada();
        lista2.adiciona("Rafael");
        lista2.adiciona(0, "Anna");
        lista2.adiciona(1, "Francisco");

        System.out.println("Lista 1: " + lista);
        System.out.println("Lista 2: " + lista2);
        System.out.println(lista2.tamanho());
        lista2.remove(2);
        System.out.println("Lista 2: " + lista2);
        System.out.println(lista2.tamanho());
        System.out.println(lista.pega(1));
        System.out.println(lista.contem("Anna"));
        System.out.println(lista.contem("Lana"));
    }
}
