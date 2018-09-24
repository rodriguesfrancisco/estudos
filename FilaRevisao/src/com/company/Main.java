package com.company;

import com.company.estrutura.Fila;
import com.company.modelagem.Aluno;

public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();

        Aluno a1 = new Aluno("Anna", 1);
        Aluno a2 = new Aluno("Francisco", 7);

        fila.adiciona(a1);
        fila.adiciona(a2);

        fila.mostra();

        fila.remove();
        fila.mostra();
        fila.remove();
        fila.mostra();
    }
}
