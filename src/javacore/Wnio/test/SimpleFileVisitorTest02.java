package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre Visit: " + file.getFileName());
        return FileVisitResult.CONTINUE;
        // Funciona como uma trigger que avisa quando entra em uma pasta. Quando fica com Continue ele varre tudo.

    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
        // Pode ser utilizado para apresentar uma falha
    }

    @Override
    public FileVisitResult postVisitDirectory(Path file, IOException exc) throws IOException {
        System.out.println("Post Visit: " + file.getFileName());
        return FileVisitResult.CONTINUE;
        // Funciona como uma trigger que avisa quando sai em uma pasta. Quando fica com Continue ele varre tudo.
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("folder");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
