package javacore.Zgenerics.service;

import javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        criarArrayComUmObjeto(new Barco("Barco maroto"));

    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

//    private static <T extends Comparable> List<T> criarArrayComUmObjeto(T t){
//        return List.of(t);
//    }
}
