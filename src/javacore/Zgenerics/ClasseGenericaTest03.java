package javacore.Zgenerics;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.dominio.Carro;
import javacore.Zgenerics.service.CarroRentalService;
import javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Moto água"), new Barco("Lancha")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Kwid"), new Carro("Onix")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetosDisponivel();
        System.out.println("Usando carro por um mês..... ");
        rentalServiceCarro.retornaObjetosDisponivel(carro);

        System.out.println("-------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetosDisponivel();
        System.out.println("Usando barco por um mês..... ");
        rentalServiceBarco.retornaObjetosDisponivel(barco);
    }
}
