package javacore.XserializacaoTest01.test;

import javacore.XserializacaoTest01.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1l, "Walace Silva", "1234");
        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("folder/alunol.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void desserializar(){
        Path path = Paths.get("folder/alunol.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
