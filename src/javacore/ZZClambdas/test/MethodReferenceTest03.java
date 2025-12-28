package javacore.ZZClambdas.test;

import javacore.ZZClambdas.domain.Anime;
import javacore.ZZClambdas.utils.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;
        AnimeComparator animeComparator = animeComparatorSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of
                (new Anime("Naruto", 500)
                        ,new Anime("Nanatsu", 120)
                        ,new Anime("Boku no Hero", 120)
                        ,new Anime("Aaron", 987)));

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        Anime fullMetalAlchemist = animeBiFunction.apply("FullMetal Alchemist", 130);
        System.out.println(fullMetalAlchemist);

    }
}
