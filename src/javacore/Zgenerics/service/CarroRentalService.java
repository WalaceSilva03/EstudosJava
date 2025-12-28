package javacore.Zgenerics.service;

import javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentalService {
    List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Kwid no asfalto antena para o alto"), new Carro("Antonio")));

    public Carro buscarCarrosDisponivel(){
        System.out.println("Buscando carro disponível....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro " + carro);
        System.out.println("Carros disponíveis para alugar: " + carrosDisponiveis);
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornaCarrosDisponivel(Carro carro){
        System.out.println("Devolvendo carro ....");
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: " + carrosDisponiveis);
        System.out.println(carrosDisponiveis);
    }
}
