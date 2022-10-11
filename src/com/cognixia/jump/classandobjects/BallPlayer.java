package com.cognixia.jump.classandobjects;

import java.time.LocalTime;

public interface BallPlayer extends GamePlayer
{
	int[] move();
	boolean shoot();
	boolean pass();
	boolean catchBall();
	
	static void showclock()
	{
		System.out.println(LocalTime.now());
	}
	
	default boolean gameInPlay()
	{
		return true;
	}
}
