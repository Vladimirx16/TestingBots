package com.vladimir.abstract_classes;

public class Scales { // Весы для взвешивания транспортных средств
    public void weighVehicle(Vehicle vehicle){
        if (vehicle instanceof Car){
            System.out.println("Загоняем машину марки " + vehicle.getDescription() + " на весы для автомобилей.\nВзвешиваем...");
            System.out.println("Машина марки " + vehicle.getDescription() + " весит " + vehicle.getWeight() + " кг.");
        } else if (vehicle instanceof Truck){
            System.out.println("Загоняем грузовик марки " + vehicle.getDescription() + " на весы для грузовиков.\nВзвешиваем...");
            System.out.println("Грузовик марки " + vehicle.getDescription() + " весит " + vehicle.getWeight() + " кг.");
        }
    }
}
