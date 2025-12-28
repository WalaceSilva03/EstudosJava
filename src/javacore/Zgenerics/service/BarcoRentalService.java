package javacore.Zgenerics.service;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalService {
    List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Moto água"), new Barco("Antonio")));

    public Barco buscarBarcosDisponivel(){
        System.out.println("Buscando carro disponível....");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando carro " + barco);
        System.out.println("Carros disponíveis para alugar: " + barcosDisponiveis);
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornaCarrosDisponivel(Barco barco){
        System.out.println("Devolvendo carro ....");
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar: " + barcosDisponiveis);
        System.out.println(barcosDisponiveis);
    }
}
