package com.cellers.daoprac;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO {

	// assume it list is working as a database
	private List<Car> cars;

	public CarDAOImpl() {
		cars = new ArrayList<>();
		cars.add(new Car(1, "BMW"));
		cars.add(new Car(2, "Bentley"));
		cars.add(new Car(3, "Mazaratti"));

	}

	@Override
	public List<Car> getAllCars() {
		return cars;
	}

	@Override
	public Car getCarById(int carId) {
		return cars.get(carId);
	}

	@Override
	public void saveCar(Car car) {
		cars.add(car);

	}

	@Override
	public void deleteCar(Car car) {
		cars.remove(car);

	}

}