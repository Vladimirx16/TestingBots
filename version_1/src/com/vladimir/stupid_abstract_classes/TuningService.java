package com.vladimir.stupid_abstract_classes;

public class TuningService {
    public void tuning(Car car){
        System.out.println("Начальная мощность автомобиля марки " + car.getModel() + " - " + car.getPower() + " л.с.");
        car.setPower(car.getPower() + 100);
        System.out.println("Автомобилю марки " + car.getModel() + " увеличили мощность на 100 л.с.");
        System.out.println("Итоговая мощность автомобиля марки " + car.getModel() + " - " + car.getPower() + " л.с.");
    }
    public void washing(Car car){
        System.out.println("Проверяем, возможно ли помыть т/с марки " + car.getModel() + "...");
        if (car.getModel().equals("Камаз")){
            System.out.println("Мы моем только машины!");
        }else{
            car.setIsClear(true);
            System.out.println("Машина марки " + car.getModel() + " успешно помыта!");
        }
    }
}
