package com.vladimir.abstract_classes;

public class Kamaz extends Truck {
    private String description = "Камаз", typeOfFuel = "дизель", typeOfTransmission = "автоматическая коробка передач";
    private int amountOfWheels = 6, amountOfFuel = 0, weight = 7000, power = 260;
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
        System.out.println("Открываем двери т/с марки " + description + ".");
    }
    public void openTheHood() {
        System.out.println("Открываем капот т/с марки " + description + ".");
    }
    public void openTheTrunk() {
        System.out.println("Открываем багажник т/с марки " + description + ".");
    }
}
