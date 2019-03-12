package com.vladimir.abstract_classes;

public class ToyotaCamry extends Car {
    private String description = "Toyota Camry", typeOfFuel = "бензин", typeOfTransmission = "автоматическая коробка передач";
    private int amountOfWheels = 4, amountOfFuel = 0, weight = 1300, power = 120;
    private boolean isClear;

    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    @Override
    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }
    @Override
    public int getAmountOfWheels() {
        return amountOfWheels;
    }
    @Override
    public int getAmountOfFuel() {
        return amountOfFuel;
    }
    @Override
    public int getWeight() {
        return weight;
    }
    @Override
    public int getPower() {
        return power;
    }
    @Override
    public boolean getIsClear() {
        return isClear;
    }
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
    @Override
    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }
    @Override
    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }
    @Override
    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }
    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public void openTheDoors() {
        System.out.println("Открываем двери автомобиля " + description + ".");
    }
    @Override
    public void openTheHood() {
        System.out.println("Открываем капот автомобиля " + description + ".");
    }
    @Override
    public void openTheTrunk() {
        System.out.println("Открываем багажник автомобиля " + description + ".");
    }
}