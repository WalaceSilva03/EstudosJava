package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneLiostTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        //smartphones.clear(); // Deleta todos objetos vinculados a lista.

        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone = smartphones.indexOf(s4);
        System.out.println(indexSmartphone);
        System.out.println(smartphones.get(indexSmartphone));
    }
}
