package com.cognixia.jump.classandobjects;

public class Engine 
{
	
	private double size;
	private String alignment;
	private int numOfCylinders;
	private String manufacturor;
	
	public Engine()
	{
		this.size = 3.0;
		this.alignment = "inline";
		this.numOfCylinders = 4;
		this.manufacturor = "Toyota";
	}

	@Override
	public String toString() 
	{
		return "\nEngine Size: " + this.size + "\nAlignment: " + this.alignment + "\nNumber Of Cylinders: " + numOfCylinders
				+ "\nManufacturor: " + manufacturor;
	}
	
	
}
