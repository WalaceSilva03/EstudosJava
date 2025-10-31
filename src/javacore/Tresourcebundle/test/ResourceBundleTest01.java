package javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Locale ("fr", "CA");
        // O Java vai procurar exatamente esse arquivo e se não achar, vai procurar um que tem somente a lingua
        // Se não achar, ele já vai buscar uma lingua e país parecida com o meu sistema operacional, se não achar
        // Vai buscar somente a linguagem e se não achar, ele vai buscar a base que é o que ativa a exception
    }
}
