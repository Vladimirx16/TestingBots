package com.vladimir.abstract_classes.abstract_classes;

public abstract class Vehicle {
    private String description, typeOfFuel, typeOfTransmission; // Описание, тип топлива, тип коробки передач
    private int amountOfWheels, amountOfFuel, weight, power; // количество колёс, количество топлива(в литрах), вес машины
    private boolean isClear; //чистая ли машина
    public String getDescription(){
        return description;
    }
    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }
    public int getAmountOfWheels(){
        return amountOfWheels;
    }
    public int getAmountOfFuel(){
        return amountOfFuel;
    }
    public int getWeight(){
        return weight;
    }
    public int getPower(){
        return power;
    }
    public boolean getIsClear(){
        return isClear;
    }
    public void setDescription(String description){
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
    public void setPower(int power){
        this.power = power;
    }
    public void setIsClear(boolean isClear) {
        this.isClear = isClear;
    }
    public void openTheDoors(){
        System.out.println("Открываем двери транспортного средства с описанием " + getDescription() + ".");
    }
    public void openTheHood(){
        System.out.println("Открываем капот транспортного средства с описанием " + getDescription() + ".");
    }
    public void openTheTrunk(){
        System.out.println("Открываем багажник транспортного средства с описанием " + getDescription() + ".");
    }
}
