package javacore.ZZDOptional.test;

import javacore.ZZDOptional.domain.Manga;
import javacore.ZZDOptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {

        Optional<Manga> optionalManga = MangaRepository.findByTitle("Pokémon");
        optionalManga.ifPresent(m -> m.setTitle("Pokémon: Batalha da Fronteira"));
        System.out.println(optionalManga);

        MangaRepository.findById(2)
                .orElseThrow(IllegalAccessError::new);

        Manga newManga = MangaRepository.findByTitle("Bleach")
                .orElse(new Manga(3, "Bleach", 332));
        System.out.println(newManga);

    }
}
