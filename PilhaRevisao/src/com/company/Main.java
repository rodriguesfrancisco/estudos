package com.company;

import com.company.estrutura.Montador;
import com.company.modelagem.Peca;

public class Main {

    public static void main(String[] args) {
        Montador montador = new Montador();

        Peca peca1 = new Peca(1, "SUPORTE");
        Peca peca2 = new Peca(2, "HELICE");
        Peca peca3 = new Peca(3, "LAMPADA");
        Peca peca4 = new Peca(4, "CUPULA DE VIDRO");

        montador.empilhar(peca1);
        montador.empilhar(peca2);
        montador.empilhar(peca3);
        montador.empilhar(peca4);

        montador.printVentilador();

        montador.desempihar();

        montador.printVentilador();
    }
}
