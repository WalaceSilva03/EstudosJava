package javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWritter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWritter01 {
    public static void main(String[] args) {
        File file = new File("filçe.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("O curso DevDojo");
            // Escrever pega recurso do sistema operacional
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
