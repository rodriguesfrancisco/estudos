package com.company.estrutura;

import com.company.modelagem.Peca;

public class Montador {

    private int tamanhoPilha = 4;
    private Peca[] ventilador;
    private int ponteiro;

    public Montador(){
        this.ventilador = new Peca[tamanhoPilha];
        this.ponteiro = 0;
    }

    public Peca[] getVentilador() {
        return ventilador;
    }

    public void setVentilador(Peca[] ventilador) {
        this.ventilador = ventilador;
    }

    private void movimentarPilha(){
        for(int i = 0; i < ponteiro; i++){
            if(ponteiro-i < ventilador.length){
                ventilador[ponteiro-i] = ventilador[ponteiro-i-1];
            }

        }

        ventilador[0] = null;
    }

    public void printVentilador(){
        String retorno = "";

        for(int i = 0; i < ventilador.length; i++){
            retorno += "["  + ventilador[i] + "]\n";
        }

        System.out.println(retorno);
    }

    public void empilhar(Peca peca){
        System.out.println("Empilhando peca: " + peca.getNome());

        movimentarPilha();
        ventilador[0] = peca;
        ponteiro++;

        printVentilador();
    }

    public void desempihar(){
        for(int i = 0; i < ventilador.length; i++){
            System.out.println("Desempilhando: " + ventilador[i]);
            ventilador[i] = null;
            printVentilador();
        }
    }
}
