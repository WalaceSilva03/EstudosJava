package javacore.ZZBcomportamento.test;

import javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = new ArrayList<>( List.of(new Car("Black", 2011), new Car("Red", 2015), new Car("White", 2022)));

    public static void main(String[] args) {

        System.out.println(filterByColor(cars, "White"));
        System.out.println(filterByYear(cars, 2021));
    }
    
    private static List<Car> filterByColor(List<Car> cars, String color){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(color)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterByYear(List<Car> cars, int year){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }


}
