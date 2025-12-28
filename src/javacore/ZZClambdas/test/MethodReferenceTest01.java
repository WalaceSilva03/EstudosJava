package javacore.ZZClambdas.test;

import javacore.ZZClambdas.domain.Anime;
import javacore.ZZClambdas.utils.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of
                (new Anime("Naruto", 500)
                ,new Anime("Nanatsu", 120)
                ,new Anime("Boku no Hero", 120)
                ,new Anime("Aaron", 987)));
        animeList.sort((AnimeComparator::CompareByTittle));
        System.out.println(animeList);
        animeList.sort((AnimeComparator::CompareByEpisodes));
        System.out.println(animeList);
    }
}
