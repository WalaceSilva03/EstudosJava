package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); // O LinkedhashSet mantém a ordem de inserção, ao contrário do hashSet
        mangas.add(new Manga(4L, "Attack on Titan", 11.55));
        mangas.add(new Manga(7L,"Hellsing ultimate", 25.6));
        mangas.add(new Manga(9L,"Attack on Titan", 10.55));
        mangas.add(new Manga(23L, "Pokemon",20.55));
        mangas.add(new Manga(55L,"Dragon Ball Z", 5.55));
        mangas.add(new Manga(55L,"Dragon Ball Z", 5.55));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
