package javacore.ZZBcomportamento.test;

import javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = new ArrayList<>( List.of(new Car("Black", 2011), new Car("Red", 2015), new Car("White", 2022)));

    public static void main(String[] args) {

        List<Car> greenCar = filter(cars, ( car -> car.getColor().equals("Black")));
        List<Car> redCar = filter(cars, ( car -> car.getColor().equals("Red")));
        List<Car> yearCar = filter(cars, ( car -> car.getYear() < 2020));
        System.out.println(greenCar);
        System.out.println(redCar);
        System.out.println(yearCar);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
