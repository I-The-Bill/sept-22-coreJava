package com.cognixia.jump.codingproblems;

import java.util.Random;

public class ArrayChallangeDriver {

	public static void main(String[] args) 
	{
		Random r = new Random();
		
		//Challange1
		System.out.println("___Starting chalange 1___\n");
		
		//Creating 2 random arrays
		final int cLength = r.nextInt(20);
		int toRandom;
		int[] first = new int[cLength];
		int[] second = new int[cLength];
		System.out.println("Generating to arrays to test");
		for (int i = 0; i<cLength; i++)
		{
			
			toRandom = r.nextInt(20);
			first[i] = toRandom;
			toRandom = r.nextInt(20);
			second[i] = toRandom;
		}
		
		//printing the random arrays for visual test
		for (int i = 0; i<cLength; i++)
		{
			System.out.print(first[i] + " ");
		}
		System.out.print("\n");
		for (int i = 0; i<cLength; i++)
		{
			System.out.print(second[i] + " ");
		}
		System.out.print("\n");
		
		//Running challenge 1 method
		if (challenge1(first,second) == true)
		{
			System.out.println("Truth located");
		}
		else
		{
			System.out.println("Well darn, they aren't equal");
		}
		
		//correct test case
		System.out.println("\nGenerating 2 arrays that are equal");
		int[] third = {54267,5,1,4,6,11};
		int[] fourth = {6,4,11,1,5,54267};
		for (int i = 0; i<third.length; i++)
		{
			System.out.print(third[i] + " ");
		}
		System.out.print("\n");
		for (int i = 0; i<fourth.length; i++)
		{
			System.out.print(fourth[i] + " ");
		}
		System.out.print("\n");
		
		//Running challenge 1 method to show a correct answer works
		if (challenge1(third,fourth) == true)
		{
			System.out.println("Truth located");
		}
		else
		{
			System.out.println("Well darn, they aren't equal");
		}
		
		
		
		//Challenge 2 start
		System.out.println("\n\n___Starting chalange 2___\n");
		
		//generating a random array with 1 random empty spot
		
		final int max = 100;
		final int min = 1;
		int[] c2 = new int[100];
		int emptySpot = r.nextInt(c2.length);
		
		System.out.println("Generating array to test");
		for (int i = 0; i <c2.length; i++)
		{
			if (i != emptySpot)
			{
				c2[i] = i+1;//r.nextInt(max-min)+min;
			}
			//System.out.print(c2[i] + " ");
		}
		
		//Printing array for challenge 2
		for (int i = 0; i <c2.length; i++)
		{
			System.out.print(c2[i] + " ");
		}
		
		//Running challenge 2
		System.out.println("\nThe empty spot in the array is at address: " + (challange2(c2)));
		
	}
	
	static boolean challenge1(int[] x, int[] y)
	{
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < y.length; j++)
			{
				if(x[i]==y[j] && x[i] != -1 && y[j] != -1)
				{
					x[i] = -1;
					y[j] = -1; 
				}
			}
		}

		for (int i = 0; i<x.length; i++)
		{
			if (x[i] != -1)
			{
				return false;
			}
		}
		return true;
		
	}
	
	static int challange2(int[] x)
	{
		int counter = 0;
		int location = 0;
		for (int i = 0; i <x.length; i++)
		{
			if (x[i] == 0)
			{
				location = i;
			}
		}
		if (counter > 1)
		{
			return -1;
		}
		else
		{
			return location;
		}
	}
}
