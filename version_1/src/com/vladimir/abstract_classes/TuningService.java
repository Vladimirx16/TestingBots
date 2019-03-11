package com.vladimir.abstract_classes;

public class TuningService {
    private int power;
    public void tuneCar(Car car){
        System.out.println("Начальная мощность автомобиля марки " + car.getDescription() + " - " + car.getPower() + " л.с.");
        car.setPower(car.getPower() + 50);
        System.out.println("Конечная мощность автомобиля марки " + car.getDescription() + " - " + car.getPower() + " л.с.");
    }
    public void tuneTruck(Truck truck){
        System.out.println("Начальная мощность грузовика марки " + truck.getDescription() + " - " + truck.getPower() + " л.с.");
        truck.setPower(power + 100);
        System.out.println("Конечная мощность грузовика марки " + truck.getDescription() + " - " + truck.getPower() + " л.с.");
    }
}
