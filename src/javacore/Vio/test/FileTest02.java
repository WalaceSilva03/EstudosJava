package javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean isDiretoryCreated = fileDiretorio.mkdir();
        System.out.println("isDirectoryCreated: " + isDiretoryCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo.txt criado: " + isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo.txt renomeado: " + isRenamed);

        File diretorioRenamed = new File("folderTwo");
        boolean isDiretoryRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretório Pasta renomeado: " + isDiretoryRenamed);
    }
}
