package javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        Scanner sc = new Scanner(texto); // Delimitador padrão como espaço em branco
        sc.useDelimiter(", ");
        while (sc.hasNext()){
            if(sc.hasNextInt()){
                int i = sc.nextInt();
                System.out.println("Int " + i);
            } else if(sc.hasNextBoolean()){
                boolean p = sc.nextBoolean();
                System.out.println("Boolean " + p);
            }else {
                System.out.println(sc.next());
            }

        }

    }
}
