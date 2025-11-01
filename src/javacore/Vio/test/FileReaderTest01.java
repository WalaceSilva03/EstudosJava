package javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);) {
//            System.out.println(fr.read()); // É apresentado o número da letra na tabela ASCII
//            char[] in = new char[30];
//            fr.read(in);
//            for (char c : in){
//                System.out.print(c);
//            }
            int i;
            while ((i=fr.read()) != -1){ // O FileReader retorna -1 quando está vazio por isso para printar tudo, usamos ela
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
