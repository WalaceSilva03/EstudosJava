package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Attack on Titan", 11.55));
        mangas.add(new Manga(7L,"Hellsing ultimate", 25.6));
        mangas.add(new Manga(9L,"Attack on Titan", 10.55));
        mangas.add(new Manga(23L, "Pokemon",20.55));
        mangas.add(new Manga(55L,"Dragon Ball Z", 5.55));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------------------------");

        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
