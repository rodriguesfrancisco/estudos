package com.company;

public class Main {

    public static void main(String[] args) {
        //MapaLista mapaLista = new MapaLista();
        MapaEspalhamento mapaEspalhamento = new MapaEspalhamento();
        Integer numeroDeElementos = 15000;
        long inicio = System.currentTimeMillis();

        for(Integer i = 0; i < numeroDeElementos; i++){
            mapaEspalhamento.adiciona("" + i, new Carro("c" + i));
        }

        for(Integer i = 0; i < numeroDeElementos; i++){
            System.out.println(mapaEspalhamento.pega("" + i));
        }

        for(Integer i = 0; i < numeroDeElementos; i++){
            mapaEspalhamento.contemChave("" + i);
        }

        for(Integer i = 0; i < numeroDeElementos; i++){
            mapaEspalhamento.remove("" + i);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo: " + (fim - inicio) / 1000.0);
    }
}
