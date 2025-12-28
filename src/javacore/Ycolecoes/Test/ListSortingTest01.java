package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Berserk");
        mangas.add("Hellsing ultimate");
        mangas.add("Attack on Titan");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");
        Collections.sort(mangas); //Organiza em ordem, alfabetica se Strings, Int se números e por ai vai

        List<Double> dinherios = new ArrayList<>();
        dinherios.add(100.21);
        dinherios.add(23.98);
        dinherios.add(123.12);

        Collections.sort(dinherios);

        for (String mangas1: mangas){
            System.out.println(mangas1);
        }

        System.out.println("-----------------------------------------");

        for (Double money: dinherios){
            System.out.println(money);
        }

    }
}
