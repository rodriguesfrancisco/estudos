package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento {
    private List<List<Associacao>> tabela = new ArrayList<List<Associacao>>();

    public MapaEspalhamento(){
        for(Integer i = 0; i < 100; i++){
            this.tabela.add(new LinkedList<Associacao>());
        }
    }

    private Integer calculaIndiceTabela(String placa){
        return Math.abs(placa.hashCode() % this.tabela.size());
    }

    public boolean contemChave(String placa){
        Integer indice = this.calculaIndiceTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);

        for(Integer i = 0; i < lista.size(); i++){
            Associacao associacao = lista.get(i);
            if(associacao.getPlaca().equals(placa)){
                return true;
            }
        }

        return false;
    }

    public void remove(String placa){
        Integer indice = this.calculaIndiceTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);

        for(Integer i = 0; i < lista.size(); i++){
            Associacao associacao = lista.get(i);
            if(associacao.getPlaca().equals(placa)){
                lista.remove(i);
                return;
            }
        }

        throw new IllegalArgumentException("A chave não existe.");
    }

    public void adiciona(String placa, Carro carro){
        if(this.contemChave(placa)){
            this.remove(placa);
        }

        Integer indice = this.calculaIndiceTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);
        lista.add(new Associacao(placa, carro));
    }

    public Carro pega(String placa){
        Integer indice = this.calculaIndiceTabela(placa);
        List<Associacao> lista = this.tabela.get(indice);
        for(Integer i = 0; i < lista.size(); i++){
            Associacao associacao = lista.get(i);
            if(associacao.getPlaca().equals(placa)){
                return associacao.getCarro();
            }
        }

        throw new IllegalArgumentException("A chave não existe.");
    }
}
