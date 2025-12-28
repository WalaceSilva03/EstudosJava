package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Attack on Titan", 11.55, 5));
        mangas.add(new Manga(7L,"Hellsing ultimate", 25.6, 0));
        mangas.add(new Manga(9L,"Attack on Titan", 10.55, 5));
        mangas.add(new Manga(23L, "Pokemon",20.55, 0));
        mangas.add(new Manga(55L,"Dragon Ball Z", 5.55, 7));
        
        // Como remover coisas específicas na lista

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if (manga.getQuantity() == 0){
                mangaIterator.remove();
            }
        }

        System.out.println(mangas); // Da forma acima podemos retirar objetos de uma lista
        mangas.removeIf(manga -> manga.getQuantity() == 0); // Dessa forma também podemos retirar objetos de uma lista

    }
}
