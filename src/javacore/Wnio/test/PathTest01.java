package javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\ProjetoCrud\\DevDojo\\Devdojo\\file.txt");
        Path p2 = Paths.get("D:", "\\ProjetoCrud\\DevDojo\\Devdojo", "file.txt");
        Path p3 = Paths.get("D:\\ProjetoCrud\\DevDojo\\Devdojo","file.txt");
        Path p4 = Paths.get("D:", "ProjetoCrud", "DevDojo", "Devdojo", "file.txt");
        System.out.println(p1.getFileName());
    }
}
