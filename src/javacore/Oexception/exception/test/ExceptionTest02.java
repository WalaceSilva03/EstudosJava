package javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args){
        criarNovoArquivo();
    }

    public static void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar o arquivo");
        }
    }
}
