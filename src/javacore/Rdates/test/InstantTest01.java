package javacore.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); // Inclui o Z no final dos nano segundos ao contrário do LocalDateTime.now
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        // O zulu time é utilizado quando precisa salvar datas no banco de dados para representar a zona de tempo correta
        // Por que utilizando o LocalDateTime, não é indicado a zona de tempo que foi colocada.
        // O zulu time é conhecido como o TimeZone UTC.
    }
}
