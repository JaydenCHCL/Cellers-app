package com.cellers.JavaDay3;

public class WashingMachine {

	Status WMStatus;
	int noOfClothes;
	double detergentAmt;

	public void switchON() {
		this.WMStatus = Status.ON;
	}

	public void switchOFF() {
		this.WMStatus = Status.OFF;
	}

	public int acceptClothes(int noOfClothes) {
		this.noOfClothes = noOfClothes;
		return noOfClothes;
	}

	public void acceptDetergent(double detergent) {
		this.detergentAmt = detergent;
	}
}

enum Status {
	OFF, ON, RUNNING
}
