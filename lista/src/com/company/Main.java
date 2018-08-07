package com.company;


public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Anna");
        a2.setNome("Francisco");
        a3.setNome("Lana");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(0, a3);

        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.contem(a2));
        System.out.println(lista.pega(2));
        lista.remove(0);
        System.out.println(lista);
    }
}
