package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Attack on Titan", 11.55));
        mangas.add(new Manga(7L,"Hellsing ultimate", 25.6));
        mangas.add(new Manga(9L,"Attack on Titan", 10.55));
        mangas.add(new Manga(23L, "Pokemon",20.55));
        mangas.add(new Manga(55L,"Dragon Ball Z", 5.55));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        mangas.sort(new MangaByIdComparator());
        System.out.println("------------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(55L,"Dragon Ball Z", 5.55);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
