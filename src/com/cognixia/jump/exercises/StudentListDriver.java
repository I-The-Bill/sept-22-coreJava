package com.cognixia.jump.exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentListDriver {

	public static void main(String[] args) 
	{
		//Setup for problem 1
		Scanner input = new Scanner(System.in);
		ArrayList<String> StudentNames = new ArrayList<String>();
		StudentNames.add("Bobby Jenkins");
		StudentNames.add("Fred Flintstone");
		StudentNames.add("Aang theAvatar");
		StudentNames.add("John Cena");
		StudentNames.add("Ricky Bobby");
		System.out.println("Do Problem 1?: \"True\" or \"False\"");
		boolean accessing = true;
		boolean skip1 = input.nextBoolean();
		
		if (skip1 == true)
		{	
//		PROBLEM 1
		
			while (accessing == true)
			{
				System.out.println("Please enter: \n"
						+ "\'1\' to search a Student\n"
						+ "\'2\' to add a student\n"
						+ "\'3\' To print the list of students\n"
						+ "\'4\' To quit the search program");
				try {
					int selection = input.nextInt();
					if (selection == 1)
					{
						System.out.println("Please enter: \n\'1\' to search by index\n\'2\'to search by name\n");
						int secondSelection = input.nextInt();
						if (secondSelection == 1)
						{
							System.out.println("Please enter the index of the student you would like to check");
							int index = input.nextInt();
							System.out.println(StudentNames.get(index));
						}
						else if (secondSelection == 2)
						{
							System.out.println("Please enter the index of the student you would like to check");
							String searchName = input.nextLine();
							for (int i = 0; i < StudentNames.size(); i++)
							{
								if (searchName.equalsIgnoreCase(StudentNames.get(i)))
								{
									System.out.println("The student exist at index " + i);
									return;
								}
							}
							System.out.println("The student does not exist or perhaps the archives are incomplete");
						}
						else if (secondSelection == 2)
						{
							System.out.println("Please enter the index of the student you would like to check");
							String searchName = input.nextLine();
							for (int i = 0; i < StudentNames.size(); i++)
							{
								if (searchName.equalsIgnoreCase(StudentNames.get(i)))
								{
									System.out.println("The student exist at index " + i);
									return;
								}
							}
						}
						else
						{
							System.out.println("Not a valid input");
						}
					}
					else if (selection == 2)
					{
						System.out.println("Enter the name of the student you would like to add");
						input.nextLine();
						String addName = input.nextLine();
						StudentNames.add(addName);
						System.out.println("The new student has been added at index " + StudentNames.indexOf(addName));
					}
					else if (selection == 3)
					{
						System.out.println("\n__Students__");
						for (String names : StudentNames)
						{
							System.out.println(names);
						}
						System.out.println("\n");
					}
					else if (selection == 4)
					{
						accessing = false;
					}
					else
					{
						System.out.println("Not a valid input");
					}
				}
				catch (InputMismatchException e)
				{
					System.out.println("Please enter 1 or 2");
					//input.next();
				}
				catch (IndexOutOfBoundsException e)
				{
					System.out.println("That index does not exist");
					//input.next();
				}
				catch (Exception e)
				{
					
					e.printStackTrace();
					//input.next();
				}
				
			}
		
		}
		else
		{
			System.out.println("on to Problem 3");
		}
		
		
		//PROBLEM 2
		
		System.out.println("\nDo Problem 2?: \"True\" or \"False\"\n");
		boolean skip2 = input.nextBoolean();
		if (skip2 == true)
		{	
			System.out.println("Please enter an integer");
			int x = input.nextInt();
			System.out.println("Please enter an integer");
			int  y = input.nextInt();
			System.out.println("X == " + x);
			System.out.println("Y == " + y);
			System.out.println("Swapping");
			/*int[] z = {x,y};
			z = swap(z);
			x = z[0];
			y = z[1];*/
			x = x+y;
			y = x-y;
			x = x-y;
			System.out.println("X == " + x);
			System.out.println("Y == " + y);
		}
		else
		{
			System.out.println("On to Problem 3");
		}
		
		
		//PROBLEM 3
		System.out.println("\nDo Problem 3?: \"True\" or \"False\"");
		boolean skip3 = input.nextBoolean();
		if (skip3 == true)
		{	
			System.out.println("Please enter a string to see if its a palindrome");
			input.nextLine();
			String palinMaybe = input.nextLine();
			String toCheck = palinMaybe.toLowerCase();//.replaceAll("\\s", "");
			System.out.println("It is " + isPalindrome(toCheck) + " that " + palinMaybe + " is a plaindrome");
		}
		else
		{
			System.out.println("Out of Problems my dude");
		}
		input.close();	
	}
	
	
	public static int[] swap(int[] x)
	{
		x[0] = x[0] + x[1];
		x[1] = x[0] - x[1];
		x[0] = x[0] - x[1];
		return x;
	}
	
	//problem 3 helper method
	public static boolean isPalindrome(String x)
	{
		boolean isAPalindrome = true;
		int i = 0;
		int j = x.length()-1;
		while (isAPalindrome == true)
		{
			char one = x.charAt(i);
			char two = x.charAt(j);
			if (i == j)
			{
				return true;
			}
			else if (one == two)
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}	
		}
		return false;
	}

}
