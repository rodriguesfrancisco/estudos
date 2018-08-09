package com.company;

public class Main {

    public static void main(String[] args) {
        MapaLista mapaLista = new MapaLista();
        Integer numeroDeElementos = 15000;
        long inicio = System.currentTimeMillis();

        for(Integer i = 0; i < numeroDeElementos; i++){
            mapaLista.adiciona("" + i, new Carro("c" + i));
        }

        for(Integer i = 0; i < numeroDeElementos; i++){
            System.out.println(mapaLista.pega("" + i));
        }

        for(Integer i = 0; i < numeroDeElementos; i++){
            mapaLista.contemChave("" + i);
        }

        for(Integer i = 0; i < numeroDeElementos; i++){
            mapaLista.remove("" + i);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo: " + (fim - inicio) / 1000.0);
    }
}
