package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());
        mangas.add(new Manga(4L, "Attack on Titan", 11.55));
        mangas.add(new Manga(7L, "Hellsing ultimate", 25.6));
        mangas.add(new Manga(9L, "Attack on Titan", 10.55));
        mangas.add(new Manga(23L, "Pokemon", 20.55));
        mangas.add(new Manga(55L, "Dragon Ball Z", 5.55));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
