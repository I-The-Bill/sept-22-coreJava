package com.cognixia.jump.classandobjects;


//This is a class designed to be inherited from
public abstract class TeamSport implements BallPlayer
{
	
	//abstract method - has to be overridden before use
	public abstract void talkToTeamate();

	//Concrete method - ready to be inherited 
	public double callTimeOut()
	{
		
		return 0.0;
	}
}
