package com.cognixia.jump.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDriver 
{
	public static void main(String[] args)
	{
		//try catch
		
		Scanner input = new Scanner(System.in);
		//input.close();
		trytry(input);
		tryScannerWResources();
		input.close();
	}
	
	public static void trytry(Scanner input)
	{	int in = 0;
		
		boolean gotAnInt = true;
		while (gotAnInt)
		{	
			try 
			{
				
				System.out.println("Gimme an INteger");
				in = input.nextInt();
				int answer = 10/in;
				System.out.println(answer);
				gotAnInt = false;
			}
			catch (InputMismatchException e)
			{
				//An empty catch block is AWFUL practice!!! DO NOT DO!!!
				System.out.println("Input an integer only");
				input.next();
	//			e.printStackTrace();
						
			}
			catch (ArithmeticException e)
			{
				//An empty catch block is AWFUL practice!!! DO NOT DO!!!
				System.out.println("Your input has caused a " + e.getMessage());
				input.next();
			}
			catch (Exception e)
			{
				//An empty catch block is AWFUL practice!!! DO NOT DO!!!
				e.printStackTrace();
				input.next();
			}
		}
		
		System.out.println("You put in " + in + "\nYou've arrived outside the 1st try. \n");
	}
	
	public static void tryScannerWResources()
	{
		String sentence = "";
		try (Scanner input2 = new Scanner(System.in))
		{
			System.out.println("Gimme a sentance");
			
			sentence = input2.nextLine();
			System.out.println(sentence);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		} //due to try with resouces, no finally needed
//		finally 
//		{
//			input.close();
//		}
		System.out.println("You put in " + sentence + "\nYou've arrived outside the the 2nd try");
	}
}
