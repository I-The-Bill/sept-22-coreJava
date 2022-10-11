package com.cognixia.jump.javabasics;

//This class will be used to showcase static and instance features of a class, to then be loaded in the static driver so we can see priority in terms of memory ordering and execution 
public class StaticDemoClass 
{
	//constructor - Instance Level
	public StaticDemoClass() 
	{
		System.out.println("This is the consturctor");
	}
	
	//Anonymous code block - Instance Level
	{
		System.out.println("This is the anonymous code block");
	}
	
	//Static code block - Class Level
	static 
	{
		System.out.println("This is the static code block");
	}
	
	//Static method - class level
	public static void staticMethod()
	{
		System.out.println("this is the static method");
	}
	
	//instance method
	public void instanceMethod()
	{
		System.out.println("this is the instantce method");
	}
}
