package me.ellebelle2;

public class Vehicle {

    private String model;
    private int passengers;
    private double fuelCap;
    private double mpg;
    // private double range;


    // Default Konstruktor
    public Vehicle() {
        model = "unknown";
        passengers = 1;
        fuelCap = 1.0;
        mpg = 1.0;
    }




    // Konstruktor:
    public Vehicle(String model, int passengers, double fuelCap, double mpg) {
        this.model = model;
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }





    // Getters och setters (accessmetoder):


    public String getModel() {
        return model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(double fuelCap) {
        this.fuelCap = fuelCap;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }




    // Metod:

    public double computeRange() {
        return mpg * fuelCap;
    }

}
