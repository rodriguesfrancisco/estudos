package com.company;

import com.company.estrutura.Lista;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();

        Aluno a1 = new Aluno("Anna", 1);
        Aluno a2 = new Aluno("Francisco", 7);
        Aluno a3 = new Aluno("Lana", 3);

        lista.adicionaPorPosicao(0, a1);
        lista.adicionaPorPosicao(1, a2);
        lista.adicionaPorPosicao(2, a3);

        for(int i = 0; i < lista.getPonteiro(); i++) {
            System.out.println(lista.pega(i));
        }

        System.out.println(lista);

        for(int i = 0; i < lista.getPonteiro(); i++){
            lista.remove(i);
            System.out.println(lista);
        }
    }
}
