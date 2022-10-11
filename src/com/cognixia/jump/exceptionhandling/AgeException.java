package com.cognixia.jump.exceptionhandling;

public class AgeException extends Exception{
	private static final int MINAGE = 21;
	
	public AgeException()
	{
		super("Age is too young");
	}
	
}
