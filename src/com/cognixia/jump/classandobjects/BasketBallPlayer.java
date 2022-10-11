package com.cognixia.jump.classandobjects;

public class BasketBallPlayer extends TeamSport implements BallPlayer, GamePlayer
{

	@Override
	public void checkGameStatus() 
	{
		
		
	}

	@Override
	public int[] move()
{
		
		return null;
	}

	@Override
	public boolean shoot() 
	{
		
		return false;
	}

	@Override
	public boolean pass() 
	{
		
		return false;
	}

	@Override
	public boolean catchBall() 
	{
		
		return false;
	}

	@Override
	public void talkToTeamate() {
		
		
	}
	
	@Override
	public double callTimeOut()
	{
		return 5.0;
	}
	
	@Override
	public boolean gameInPlay()
	{
		return false;
	}

}
