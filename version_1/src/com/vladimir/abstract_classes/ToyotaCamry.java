package com.vladimir.abstract_classes;

public class ToyotaCamry extends Car {
    private String description = "Toyota Camry", typeOfFuel = "бензин", typeOfTransmission = "автоматическая коробка передач";
    private int amountOfWheels = 4, amountOfFuel = 0, weight = 1300, power = 120;
    private boolean isClear;

    @Override
    public String getDescription() {
        return description;
    }
    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }
    public int getAmountOfWheels() {
        return amountOfWheels;
    }
    public int getAmountOfFuel() {
        return amountOfFuel;
    }
    public int getWeight() {
        return weight;
    }
    public int getPower() {
        return power;
    }
    public boolean isClear() {
        return isClear;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }
    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }
    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public void openTheDoors() {
        System.out.println("Открываем двери автомобиля " + description + ".");
    }

    public void openTheHood() {
        System.out.println("Открываем капот автомобиля " + description + ".");
    }

    public void openTheTrunk() {
        System.out.println("Открываем багажник автомобиля " + description + ".");
    }
}