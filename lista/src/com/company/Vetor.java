package com.company;

import java.util.Arrays;

public class Vetor {
    private Object[] objetos = new Object[100];

    private Integer totalDeObjetos = 0;

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        this.objetos[this.totalDeObjetos] = aluno;
        this.totalDeObjetos++;
    }

    public void adiciona(Integer posicao, Aluno aluno){
        this.garanteEspaco();
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida.");
        }

        for(Integer i = this.totalDeObjetos - 1; i >= posicao; i-=1){
            this.objetos[i + 1] = this.objetos[i];
        }

        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
    }

    public Object pega(Integer posicao) {
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.objetos[posicao];
    }

    public void remove(Integer posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida.");
        }
        for(Integer i = posicao; i < this.totalDeObjetos - 1; i++){
            this.objetos[i] = this.objetos[i + 1];
        }
        this.totalDeObjetos--;
    }

    public boolean contem(Aluno aluno){
        for(Integer i = 0; i < this.totalDeObjetos; i++){
            if(aluno == this.objetos[i]){
                return true;
            }
        }
        return false;
    }

    public Integer tamanho(){
        return this.totalDeObjetos;
    }

    @Override
    public String toString(){
        if(this.totalDeObjetos == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for(Integer i = 0; i < this.totalDeObjetos - 1; i++){
            builder.append(this.objetos[i]);
            builder.append(", ");
        }

        builder.append(this.objetos[this.totalDeObjetos - 1]);
        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoOcupada(Integer posicao){
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }

    private void garanteEspaco(){
        if(this.totalDeObjetos == this.objetos.length){
            Object[] novoArray = new Object[this.objetos.length * 2];
            for(Integer i = 0; i < this.objetos.length; i++){
                novoArray[i] = this.objetos[i];
            }
            this.objetos = novoArray;
        }
    }
}
