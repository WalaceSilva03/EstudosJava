package javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWritter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O curso DevDojo\nTeste123");
            // Escrever pega recurso do sistema operacional e existe a chance de fechar o arquivo e o sistema operacional
            // Não ter enviado totalmente o conteúdo do arquivo
            fw.flush(); // Essa função força a cuspir o resíduo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
