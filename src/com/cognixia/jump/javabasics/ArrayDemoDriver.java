package com.cognixia.jump.javabasics;

import com.cognixia.jump.classandobjects.Animal;
import com.cognixia.jump.classandobjects.Horse;

//Class will demo declaring intailaizing, reading, writing, and loop through arrays or primitive and object values 
public class ArrayDemoDriver {

	public static void main(String[] args) 
	{
		//Declare
		/*int[] temperatures;
		int grades[] = {90, 85, 87, 70};
		
		//initalzie
		temperatures = new int[5];
		Animal[] animals = {new Animal(), new Animal("Horse", 500.0)}; 
		Animal[] altAnimals = new Animal[3];
		//read from array
		System.out.println(animals[0]);
		System.out.println(altAnimals[0]);
		
		
		//WARNING ARRAY OUT OF BOUNDS 
		//System.out.println(grades[7]);
		System.out.println(grades[0]);
		grades[0] = 100;
		
		System.out.println(grades[0]);
		
		
		System.out.println(animals[1]);
		animals[1] = null;
		System.out.println(animals[1]);
		
		
		
		
		
		
		System.out.println("\n\nAnimal Array:");
		for (int i = 0; i < animals.length; i++)
		{
			System.out.println(animals[i] + "\n");
			
		}
		
		for (int grade : grades)
		{
			System.out.println(grade);
		}
		*/
		//Heterogenous Arryas
		Animal[] creatures = new Animal[4];
		creatures[0] = new Animal();
		creatures[1] = new Horse("Clysdedale" , 500.0);
		creatures[2] = new Unicorn();
		creatures[3] = new Animal("Dog", 40.0);
		
		for (int i = 0; i < creatures.length; i++)
		{
			System.out.println(creatures[i] + "\n");
			
		}
		
		for (Animal animal : creatures)
		{
			System.out.println(animal);
		}
		
		
		char[][] grid = {{'a', 'b', 'c'},
						{'d', 'e', 'f'},
						{'g', 'h', 'i'}};
	
	
		for (int i = 0; i < grid.length; i++)
			for(int j = 0; j<grid[i].length;j++)
			{
				System.out.println(grid[i][j] + " ");
			}
	}

}
