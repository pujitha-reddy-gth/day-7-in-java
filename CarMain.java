package com.blc.elc;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.setCarDetails("Swift", "Marutil",600000.0);
		System.out.println(c.getCarDetails());
	}

}