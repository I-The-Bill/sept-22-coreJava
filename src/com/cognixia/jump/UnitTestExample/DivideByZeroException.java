package com.cognixia.jump.UnitTestExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideByZeroException extends Exception 
{

	
	public DivideByZeroException() 
	{
		super("Cannot divide number by zero");

	}
}
