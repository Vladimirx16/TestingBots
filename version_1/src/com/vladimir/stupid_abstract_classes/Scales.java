package com.vladimir.stupid_abstract_classes;

public class Scales {
    public void getWeightCar(Car car){
        if (car.getModel().equals("Камаз")){
            System.out.println("На этих весах можно взвешивать только машины!");
        }else{
            System.out.println("Вес автомобиля марки " + car.getWeight() + " - " + car.getWeight() + " кг.");
        }
    }
    public void getWeightTruck(Car car){
        if (car.getModel().equals("Камаз")){
            System.out.println("Вес автомобиля марки " + car.getModel() + " - " + car.getWeight() + " кг.");
        }else{
            System.out.println("На этих весах можно взвешивать только грузовики!");
        }
    }
}
