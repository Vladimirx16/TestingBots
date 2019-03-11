package com.vladimir.stupid_abstract_classes;

public class Car {
    private String model;
    private int power, amountOfWheels, weight;
    public boolean isAutomate, isClear = false;
    public String getModel(){
        return model;
    }
    public int getPower(){
        return power;
    }
    public int getAmountOfWheels(){
        return amountOfWheels;
    }
    public int getWeight(){
        return weight;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setAmountOfWheels(int amountOfWheels){
        this.amountOfWheels = amountOfWheels;
    }
    public void setIsAutomate(boolean isAutomate){
        this.isAutomate = isAutomate;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setIsClear(boolean isClear){
        this.isClear = isClear;
    }
}
