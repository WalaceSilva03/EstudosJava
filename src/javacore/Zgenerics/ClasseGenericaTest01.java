package javacore.Zgenerics;

import javacore.Zgenerics.dominio.Carro;
import javacore.Zgenerics.service.CarroRentalService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentalService carroRentalService = new CarroRentalService();
        Carro carro = carroRentalService.buscarCarrosDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentalService.retornaCarrosDisponivel(carro);
    }
}
