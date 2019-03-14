package com.vladimir.abstract_classes.classes;

import com.vladimir.abstract_classes.abstract_classes.Car;
import com.vladimir.abstract_classes.abstract_classes.Truck;
import com.vladimir.abstract_classes.abstract_classes.Vehicle;

public class TuningService {
    public void tuneVehicle(Vehicle vehicle){
        System.out.println("Начальная мощность транспортного средства марки " + vehicle.getDescription() + " - " + vehicle.getPower() + " л.с.\nТюнингуем...");
        vehicle.setPower(vehicle.getPower() + 100);
        System.out.println("Конечная мощность транспортного средства марки " + vehicle.getDescription() + " - " + vehicle.getPower() + " л.с.");
    }
    public void fillUpVehicle(Vehicle vehicle){
        if (vehicle instanceof Car){
            System.out.println("Начальное количество топлива у машины марки " + vehicle.getDescription() + " - " + vehicle.getAmountOfFuel() + " литров.");
            vehicle.setAmountOfFuel(vehicle.getAmountOfFuel() + 30);
            System.out.println("Заправляем 30 литров, " + vehicle.getTypeOfFuel() + "...\nКонечное количество топлива у машины марки " + vehicle.getDescription() + " - " + vehicle.getAmountOfFuel() + " литров.");
        }else if (vehicle instanceof Truck){
            System.out.println("Начальное количество топлива у грузовика марки " + vehicle.getDescription() + " - " + vehicle.getAmountOfFuel() + " литров.");
            vehicle.setAmountOfFuel(vehicle.getAmountOfFuel() + 30);
            System.out.println("Заправляем на 30 литров, " + vehicle.getTypeOfFuel() + "...\nКонечное количество топлива у грузовика марки " + vehicle.getDescription() + " - " + vehicle.getAmountOfFuel() + " литров.");
        }
    }
    public void cleanVehicle(Vehicle vehicle){
        System.out.println("Моем транспортное средство марки " + vehicle.getDescription() + ".");
        vehicle.setIsClear(true);
        System.out.println("Транспортное средство марки " + vehicle.getDescription() + " теперь чистое!");
    }
}
