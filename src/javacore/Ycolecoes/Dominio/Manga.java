package javacore.Ycolecoes.Dominio;

import java.util.Comparator;
import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private Double price;
    private int quantity;

    public Manga(Long id, String name, Double price) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long id, String name, Double price, int quantity) {
        this(id, name, price);
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Manga outroManga) {
        // Negativo se o this < outroManga
        // se this == outroManga, return 0
        // Positivo se this > outroManga
        return this.name.compareTo(outroManga.getName()); // Só pode ser utilizado por Wrappers
        //Temos que fazer isso para o Java se organizar no Sorting.
    }
}
