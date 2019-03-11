package com.vladimir.stupid_abstract_classes;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.setModel("Toyota");
        toyota.setPower(1500);
        toyota.setAmountOfWheels(4);
        toyota.setWeight(1000);
        toyota.setIsAutomate(true);

        Car mazda = new Car();
        mazda.setModel("Mazda");
        mazda.setPower(2000);
        mazda.setAmountOfWheels(6);
        mazda.setWeight(1200);
        mazda.setIsAutomate(false);

        Car kamaz = new Car();
        kamaz.setModel("Камаз");
        kamaz.setPower(6000);
        kamaz.setAmountOfWheels(6);
        kamaz.setWeight(2000);
        kamaz.setIsAutomate(true);

        TuningService service = new TuningService();
        service.tuning(toyota);
        service.tuning(kamaz);
        System.out.println("\n");
        service.washing(toyota);
        service.washing(kamaz);
        System.out.println("\n");
        Scales scalesForCar = new Scales();
        Scales scalesForTruck = new Scales();
        scalesForCar.getWeightTruck(toyota);
        scalesForTruck.getWeightCar(kamaz);
    }
}
