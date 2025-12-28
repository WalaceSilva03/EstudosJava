package javacore.ZZClambdas.test;

import javacore.ZZClambdas.domain.Anime;
import javacore.ZZClambdas.utils.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of
                (new Anime("Naruto", 500)
                        ,new Anime("Nanatsu", 120)
                        ,new Anime("Boku no Hero", 120)
                        ,new Anime("Aaron", 987)));
        animeList.sort((animeComparator::CompareByEpisodesNonStatic));
        System.out.println(animeList);


        List<String> strings = List.of("Alice", "Nicolas", "Pedro");

        Function<String, Integer> numIntegerParse = Integer::parseInt;
        System.out.println(numIntegerParse.apply("12134"));

        BiPredicate<List<String>, String> checkNames = List::contains;
        System.out.println(checkNames.test(strings, "Pedro"));
    }
}
