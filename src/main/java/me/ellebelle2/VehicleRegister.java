package me.ellebelle2;

public class VehicleRegister {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(); // använder default konstruktor.
        Vehicle vehicle2 = new Vehicle("Volvo EX60", 4, 60, 35);


        IO.println(vehicle.getModel());
        IO.println(vehicle2.getModel());
    }
}
