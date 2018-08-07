package com.company;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<Object> pecas = new LinkedList<Object>();

    public void insere(Peca peca){
        this.pecas.add(peca);
    }
    public Object remove(){
        return this.pecas.remove(this.pecas.size() - 1);
    }
    public boolean vazia(){
        return this.pecas.size() == 0;
    }
}
