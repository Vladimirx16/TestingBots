package com.vladimir.abstract_classes;

public class Main {
    public static void main(String[] args) {
        ToyotaCamry toyotaCamry0 = new ToyotaCamry();
        Kamaz kamaz0 = new Kamaz();

        TuningService tuningService = new TuningService();
        tuningService.tuneCar(toyotaCamry0);
        System.out.println("\n");
        tuningService.tuneTruck(kamaz0);
    }
}
