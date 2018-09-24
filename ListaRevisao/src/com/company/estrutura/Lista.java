package com.company.estrutura;

import com.company.Aluno;

import java.util.Arrays;

public class Lista {

    private Aluno[] alunos = new Aluno[5];
    private Integer ponteiro = 0;

    /*public void adiciona(Aluno aluno){
        alunos[ponteiro] = aluno;
        ponteiro++;
    }*/

    public void adicionaPorPosicao(Integer posicao, Aluno aluno){
        alunos[posicao] = aluno;
        ponteiro++;
    }

    public Aluno pega(Integer posicao){
        return alunos[posicao];
    }

    public void remove(Integer posicao){
        alunos[posicao] = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }

    public Integer getPonteiro() {
        return ponteiro;
    }
}
