package javacore.ZZDOptional.repository;

import javacore.ZZDOptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Jujutsu Kaisen", 225), new Manga(2, "Pokémon", 333));

    public static Optional<Manga> findById(Integer id){
        return findBy(s -> s.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(s -> s.getTitle().equals(title));
    }


    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
