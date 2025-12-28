package javacore.ZZClambdas.utils;

import javacore.ZZClambdas.domain.Anime;

public class AnimeComparator {
        public static int CompareByTittle(Anime a1, Anime a2){
            return a1.getTitle().compareTo(a2.getTitle());
        }

        public static Integer CompareByEpisodes(Anime a1, Anime a2){
            return a1.getEpisodes().compareTo(a2.getEpisodes());
        }

        public Integer CompareByEpisodesNonStatic(Anime a1, Anime a2){
        return a1.getEpisodes().compareTo(a2.getEpisodes());
        }
}
