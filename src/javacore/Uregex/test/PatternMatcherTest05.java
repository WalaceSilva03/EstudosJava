package javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os Dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espeços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // [] = metacaractere de range
        // Quantificadores ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até n até m
        //()
        // | o(v|c)o // Vai dar match nas ocorrências ovo e oco.
        // $ Fim da linha
        // . Ele é o caractere ele encontra algo entre dois caracteres 1.3 = 123, 133, 1@3, 1A3
        // ^ Ele busca um match no inicio da String e dentro dos colchetes ele funciona como negativa
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontrada");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
        }
    }
}