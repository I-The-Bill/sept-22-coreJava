package com.cognixia.jump.javabasics;

public class StaticDemoDriver {

	public static void main(String[] args) 
	{
		
		//StaticDemoClass.staticMethod();
		StaticDemoClass demoClass = new StaticDemoClass();
		//StaticDemoClass.staticMethod();
		demoClass.instanceMethod();
		StaticDemoClass demoClass2 = new StaticDemoClass();
	}	

}
