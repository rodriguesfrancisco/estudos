package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        ConjuntoEspalhamento novo = new ConjuntoEspalhamento();

        for(Integer i = 0; i < 50000; i++){
            novo.adiciona("palavra" + i);
        }

        for(Integer i = 0; i < 50000; i++){
            novo.adiciona("palavra" + i);
        }

        long fim = System.currentTimeMillis();

        System.out.println(novo.pegaTodas());
        System.out.println("Tempo: " + (fim - inicio) / 1000.0);
    }
}
