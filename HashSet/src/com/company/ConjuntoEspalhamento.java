package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
    private List<List<String>> tabela = new ArrayList<List<String>>();
    private Integer tamanho = 0;

    public ConjuntoEspalhamento(){
        for(Integer i = 0; i < 26; i++){
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
            this.tamanho++;
        }
    }

    public void adiciona(String palavra){
        if(!this.contem(palavra)){
            this.verificaCarga();
            Integer indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
        }
    }

    public void remove(String palavra){
        if(this.contem(palavra)){
            Integer indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
            this.verificaCarga();
            this.tamanho--;
        }
    }

    public boolean contem(String palavra) {
        Integer indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);

        return lista.contains(palavra);
    }

    public List<String> pegaTodas(){
        List<String> palavras = new ArrayList<String>();

        for(Integer i = 0; i < this.tabela.size(); i++){
            palavras.addAll(this.tabela.get(i));
        }

        return palavras;
    }

    public Integer tamanho(){
        return this.tamanho;
    }

    private Integer calculaIndiceDaTabela(String palavra){
        Integer codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();
    }

    private Integer calculaCodigoDeEspalhamento(String palavra){
        Integer codigo = 1;
        for(Integer i = 0; i < palavra.length(); i++){
            codigo = 31 * codigo + palavra.charAt(i);
        }
        return codigo;
    }

    public void imprimeTabela(){
        for(List<String> lista : this.tabela){
            System.out.print("[");
            for(Integer i = 0; i < lista.size(); i++){
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

    private void redimensionaTabela(Integer novaCapacidade){
        List<String> palavras = this.pegaTodas();
        this.tabela.clear();

        for(Integer i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<String>());
        }

        for(String palavra : palavras){
            this.adiciona(palavra);
        }
    }

    private void verificaCarga(){
        Integer capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;

        if(carga > 0.75){
            this.redimensionaTabela(capacidade * 2);
        } else if (carga < 0.25){
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }
}
