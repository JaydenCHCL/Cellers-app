package com.cellers.javaDay3;

public class Vehicle {

	int vehicleNo = 1234;
	String model = "Tundra";
	String manufacturer = "Toyota";
	String color = "Gray";

	public int getVehicleNo() {
		return vehicleNo;
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println("You changed the color to: " + color);
	}

}

class Truck extends Vehicle {

	String loadingCapacity = "100 tons";

	public String getLoadingCapacity() {
		return loadingCapacity;
	}

	public void setLoadingCapacity(String loadingCapacity) {
		this.loadingCapacity = loadingCapacity;
		System.out.println("You changed the loading capacity to: " + loadingCapacity);
	}

	@Override
	public String toString() {
		return "Truck [loadingCapacity = " + loadingCapacity + ", vehicleNo = " + vehicleNo + ", model = " + model
				+ ", manufacturer = " + manufacturer + ", color = " + color + "]";
	}

}