package com.hcl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
//Autowired can be placed on either setter method or member variable or constructor

@Component("veh")
public class Vehicle {

	private Car car;
	 @Autowired   //Be default it refers to byType
	 public Vehicle(Car car) {
		 this.car=car;
	 }
	
	
    
    public Car getCar() {
		return car;
	}

   
	public void setCar(Car car) {
		this.car = car;
	}



	public void showCar() {
    	car.getBrandName();
    }


	@Override
	public String toString() {
		return "Vehicle [car=" + car + "]";
	}
	
	
}
