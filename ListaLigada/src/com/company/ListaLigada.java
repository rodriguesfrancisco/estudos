package com.company;


public class ListaLigada {
    private Celula primeira;

    private Celula ultima;

    private Integer totalDeElementos;

    public void adiciona(Object elemento) {
        if(this.totalDeElementos == 0){
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }
    public void adiciona(Integer posicao, Object elemento) {}
    public Object pega(Integer posicao) {return  null;}
    public void remove(Integer posicao) {}
    public Integer tamanho(){return 0;}
    public boolean contem(Object o) {return false;}
    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;

        if(this.totalDeElementos == 0){
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }
    public void removeDoComeco() {}
    public void removeDoFim() {}

    @Override
    public String toString(){
        if(this.totalDeElementos == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        for(Integer i = 0; i < this.totalDeElementos - 1; i++){
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }

        builder.append(atual.getElemento());
        builder.append("]");

        return builder.toString();
    }
}
