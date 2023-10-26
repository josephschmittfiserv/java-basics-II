package Inheritance.Abstraction;

public abstract class Vehicle {
    private int gasTankCapacity;
    private int topSpeed;
    private String vehicleName;

    abstract int gasTankCapacity();
    
    abstract int getTopSpeed();

    abstract String getVehicleName();
}