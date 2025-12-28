package javacore.ZZAclassesinternas;

import javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    class BarciBaneCinoarator implements Comparator<Barco> {
        @Override
        public int compare(Barco o1, Barco o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
