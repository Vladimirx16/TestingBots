package com.vladimir.abstract_classes.abstract_classes;

public abstract class Car extends Vehicle{
    private String description = "Машина", typeOfFuel, typeOfTransmission; // Описание, тип топлива, тип коробки передач
    private int amountOfWheels, amountOfFuel, weight, power, tirePressure; // количество колёс, количество топлива(в литрах), вес машины
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
}
