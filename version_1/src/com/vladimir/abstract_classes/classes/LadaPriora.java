package com.vladimir.abstract_classes.classes;


import com.vladimir.abstract_classes.abstract_classes.Car;
import com.vladimir.abstract_classes.abstract_classes.interfaces.GarageTuning;

public class LadaPriora extends Car implements GarageTuning {
    private String description = "Lada Priora", typeOfFuel = "бензин", typeOfTransmission = "ручная коробка передач";
    private int amountOfWheels = 4, amountOfFuel = 0, weight = 1100, power = 120, tirePressure = 2; // tirePressure - давление в шинах, 2 атмосферы
    private boolean isClear = false;

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

    public int getTirePressure(){
        return tirePressure;
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

    public void setTirePressure(int tirePressure){
        this.tirePressure = tirePressure;
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


    @Override
    public void Scream() {
        System.out.println("АААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА");
    }
    @Override
    public String getDescript(){
        return ("Lada Priora");
    }
}
