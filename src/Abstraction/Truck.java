package Abstraction;

public class Truck extends Vehicle {
    @Override
	int gasTankCapacity() {
		return 50;
	}

	@Override
	int getTopSpeed() {
		return 100;
	}

	@Override
	String getVehicleName() {
		return "Chevy Silverado";
	}
}
