package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Manga;
import javacore.Ycolecoes.Dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> navigableSet = new TreeSet<>(new SmartphoneMarcaComparator());
            Smartphone smartphone = new Smartphone("1234", "Nokia");
            navigableSet.add(smartphone);
            NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
            mangas.add(new Manga(4L, "Attack on Titan", 11.55));
            mangas.add(new Manga(7L,"Hellsing ultimate", 25.6));
            mangas.add(new Manga(9L,"Jujutsu Kaisen", 10.55));
            mangas.add(new Manga(23L, "Pokemon",20.55));
            mangas.add(new Manga(55L,"Dragon Ball Z", 5.55));
            mangas.add(new Manga(51L,"Eragon", 10.00));

        for (Manga manga : mangas) {
            System.out.println(manga);

        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 9.75);

        System.out.println("-----------------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.pollFirst());


    }
}
