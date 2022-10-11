package com.cognixia.jump.classandobjects;

public interface GamePlayer 
{
	
	//A varible in an interface is public static and final
	int PLAYER_NUMBER = 1;
	
		
	// Due to being interface -> public abstract <- is implied;
	//all methods are public and abstract
	void checkGameStatus();
	
	
	
}
