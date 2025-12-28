package javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numberos = new ArrayList<>();

        numberos.add(2);
        numberos.add(0);
        numberos.add(4);
        numberos.add(3);
        // (-(ponto inserção) -1)
        // index 0,1,2,3
        // value 0,2,3,4
        Collections.sort(numberos);
        System.out.println(Collections.binarySearch(numberos, 1));

    }
}
