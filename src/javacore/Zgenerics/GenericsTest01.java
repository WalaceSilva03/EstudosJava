package javacore.Zgenerics;

import javacore.Ycolecoes.Dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Midorya");
        lista.add("Midorya");

        for (String s : lista) {
            System.out.println(s);
        }
        add(lista, new Consumidor("Midorya"));

        for (String s : lista) {
            System.out.println(s);
        }

    }

    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
