package javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList(); //É um Array que pode ser dinamicamente aumentado e não precisa declarar o tamanho inicialmente
        List nomes2 = new ArrayList(); //É um Array que pode ser dinamicamente aumentado e não precisa declarar o tamanho inicialmente
        // Até a versão 1.4 era utilizado da forma acima.
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes2.add("Nicola");
        nomes2.add("ABC silva");
        nomes.addAll(nomes2);
        nomes.remove("Williams"); // Ele utiliza o equals para verificar se é igual, também pode ser usado o index.

        for(Object nome: nomes){
            System.out.println(nome);
        }

        List<String> names = new ArrayList<>(); // Atualmente força a declarar o tipo dos objetos
        names.add("WEalace");
        names.add("UALACE");

        System.out.println("------------------------------------");

        for(String nome: names){
            System.out.println(nome);
        }
        System.out.println("------------------------------------");
        // Como pegar pelo indice.
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
    }
}
