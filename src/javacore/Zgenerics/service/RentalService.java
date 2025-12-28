package javacore.Zgenerics.service;

import javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetosDisponivel(){
        System.out.println("Buscando objetos disponível....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto " + t);
        System.out.println("Objetos disponíveis para alugar: " + objetosDisponiveis);
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornaObjetosDisponivel(T t){
        System.out.println("Devolvendo objetos ....");
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: " + t);
        System.out.println(t);
    }
}
