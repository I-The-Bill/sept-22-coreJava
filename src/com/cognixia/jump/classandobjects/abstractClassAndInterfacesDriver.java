package com.cognixia.jump.classandobjects;

public class abstractClassAndInterfacesDriver {

	public static void main(String[] args) 
	{
		//showing inheritance and polymorphism in instantiating objects
		BasketBallPlayer bbPlayer = new BasketBallPlayer();
		TeamSport bbPlayer2 = new BasketBallPlayer();
		BasketBallPlayer bbPlayer3 = new BasketBallPlayer();
		GamePlayer bbPlayer4 = new BasketBallPlayer();
		
		GamePlayer[] Team1 = new GamePlayer[5];
		
		System.out.println(bbPlayer.callTimeOut());
		System.out.println(bbPlayer2.callTimeOut());
		
		BallPlayer.showclock();
		
		System.out.println(bbPlayer3.gameInPlay());
	}

}
