package com.vladimir.abstract_classes;

import com.vladimir.abstract_classes.classes.*;

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
        System.out.println("\n");

        /*
        Юзаем интерфейсы
         */

        tuningService.setTirePressure(toyotaCamry0);
        System.out.println("\n");
        tuningService.setTirePressure(kamaz0);
        System.out.println("\n");

        /*
        По понятиям
         */

        LadaPriora ladaPriora = new LadaPriora();
        ladaPriora.Scream();
        System.out.println("\n");

        System.out.println("\n");
        tuningService.isElite(ladaPriora);
    }
}
