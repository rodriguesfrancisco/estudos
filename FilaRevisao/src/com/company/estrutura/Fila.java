package com.company.estrutura;

import com.company.modelagem.Aluno;

import javax.swing.*;

public class Fila {

    private int inicio;
    private int fim;
    private int tamanho;
    private int qtdElementos;
    private Aluno f[];

    public Fila() {
        inicio = fim = -1;
        tamanho = 100;
        f = new Aluno[tamanho];
        qtdElementos = 0;
    }

    private boolean estaVazia() {
        if (qtdElementos == 0) {
            return true;
        }
        return false;
    }

    private boolean estaCheia(){
        if(qtdElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void adiciona(Aluno aluno){
        if(!estaCheia()){
            if(inicio == -1){
                inicio = 0;
            }
            fim++;
            f[fim] = aluno;
            qtdElementos++;
        }
    }

    public void remove(){
        if(!estaVazia()) {
            inicio++;
            qtdElementos--;
        }
    }

    public void mostra(){
        String resultado = "";
        for(int i = inicio; i <= fim; i++) {
            resultado += f[i] + " ";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
