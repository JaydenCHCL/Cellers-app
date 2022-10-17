package com.hcl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

interface SportsCar{
	public void getCarName();
}
@Component("bmw")
class BMW implements SportsCar{

	@Override
	public void getCarName() {
		System.out.println("This is from BMW");
		
	}
	
}

@Component("ferrari")
class Ferrari implements SportsCar{

	@Override
	public void getCarName() {
		System.out.println("This is from Ferrari");
		
	}
	
}
@Component("gen")
public class Generic {
	@Autowired
	@Qualifier("bmw")
   	private SportsCar scar;
	
	public void showCar() {
		scar.getCarName();
	}
	
	

}
