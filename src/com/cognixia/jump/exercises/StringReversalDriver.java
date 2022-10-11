package com.cognixia.jump.exercises;

public class StringReversalDriver {

	public static void main(String[] args)
	{	//setup
		String x = "Wubadubdub";
		String y = "Why are you running";
		String z = "I am your father";
		//Challenge 1
		System.out.println("__Staring Challenge 1\n");
		System.out.println("String entered: " + x);
		System.out.println("String reversed: " + challenge1(x));
		//challenge 2
		System.out.println("\n__Staring Challenge 2\n");
		System.out.println("String entered: " + y);
		System.out.println("String reversed: " + challenge2(y));
		//challenge 3
		System.out.println("\n__Staring the BonusChallenge\n");
		System.out.println("String entered: " + z);
		System.out.println("String reversed: " + BonusChallenge(z));
	}
	
	static StringBuilder challenge1(String x)
	{
		StringBuilder rev = new StringBuilder(x);
		return rev.reverse();
		
	}
	
	static String challenge2(String x)
	{
		char[] toReverse = new char[x.length()];
		String toReturn = "";
		for (int i = 0; i<toReverse.length; i++)
		{
			//toReverse[i] = x.charAt(x.length()-1-i);
			//toReturn += (toReverse[i]);
			toReturn += x.charAt(x.length()-1-i);
		}
		return toReturn;
	}
	
	static String BonusChallenge(String x)
	{
		String[] toReverse = x.split(" ");
				//new char[x.length()];
		String toReturn = "";
		for (int i = 0; i<toReverse.length; i++)
		{
			StringBuilder reversedPart = challenge1(toReverse[i]);
			toReturn += reversedPart + " ";
			//System.out.println(toReverse[i]);
		}
		return toReturn;
	}
	
}
