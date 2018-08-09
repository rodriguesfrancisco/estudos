package com.company;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {
    private List<Associacao> associacoes = new ArrayList<Associacao>();

    public void adiciona(String placa, Carro carro){
        if(!this.contemChave(placa)){
            Associacao associacao = new Associacao(placa, carro);
            this.associacoes.add(associacao);
        }
    }

    public Carro pega(String placa){
        return null;
    }

    public void remove(String placa){

    }

    public boolean contemChave(String placa){
        return false;
    }
}
