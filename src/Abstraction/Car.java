package Inheritance.Abstraction;

public class Car extends Vehicle {

	@Override
	int gasTankCapacity() {
		return 20;
	}

	@Override
	int getTopSpeed() {
		return 150;
	}

	@Override
	String getVehicleName() {
		return "Honda Civic";
	}
    
}
