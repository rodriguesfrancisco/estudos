package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario.setNome("Anna");
        usuario2.setNome("Francisco");

        List list = new ArrayList();

        list.add(usuario);
        list.add(usuario2);

        list.forEach(System.out::println);
    }
}
