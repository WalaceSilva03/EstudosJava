package javacore.Ycolecoes.Test;

import javacore.Ycolecoes.Dominio.Consumidor;
import javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Walace Silva");
        Consumidor consumidor2 = new Consumidor("Vendedor");

        List<Manga> mangas = new ArrayList<>();
        Manga manga1 = new Manga(4L, "Attack on Titan", 11.55);
        Manga manga2 = new Manga(7L, "Hellsing ultimate", 25.6);
        Manga manga3 = new Manga(9L, "Attack on Titan", 10.55);
        Manga manga4 = new Manga(23L, "Pokemon", 20.55);
        Manga manga5 = new Manga(55L, "Dragon Ball Z", 5.55);
        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
