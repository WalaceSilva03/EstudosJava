package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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