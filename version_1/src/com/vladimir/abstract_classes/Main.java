package com.vladimir.abstract_classes;

public class Main {
    public static void main(String[] args) {
        ToyotaCamry toyotaCamry0 = new ToyotaCamry();
        Kamaz kamaz0 = new Kamaz();

        TuningService tuningService = new TuningService();

        Scales scales = new Scales();

        /*
        Пробуем все методы тюнинг сервиса на объектах класса
        Car и Truck
         */

        tuningService.tuneVehicle(toyotaCamry0);
        System.out.println("\n");
        tuningService.tuneVehicle(kamaz0);
        System.out.println("\n");
        tuningService.fillUpVehicle(toyotaCamry0);
        System.out.println("\n");
        tuningService.fillUpVehicle(kamaz0);
        System.out.println("\n");
        tuningService.cleanVehicle(toyotaCamry0);
        System.out.println("\n");
        tuningService.cleanVehicle(kamaz0);
        System.out.println("\n");
        scales.weighVehicle(toyotaCamry0);
        System.out.println("\n");
        scales.weighVehicle(kamaz0);
    }
}
