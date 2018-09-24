package com.company;

public class GradeBook {
    private String nomeDoCurso;
    private int[] notas;

    public GradeBook(String nomeDoCurso, int[] notas){
        this.nomeDoCurso = nomeDoCurso;
        this.notas = notas;
    }

    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso(){
        return nomeDoCurso;
    }

    public void processaNotas(){
        saidaDeNotas();

        System.out.printf("%nMédia da Classe é: %.2f%n", getMedia());
    }
}
