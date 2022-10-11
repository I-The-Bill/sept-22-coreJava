package com.cognixia.jump.collectionsgenerics;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//import java.util.*;


public class CollectionsdGenericsDriver {

	public static void main(String[] args)
	{
		// Showcasing generics method and VarArgs from Calculator 
		System.out.println(Calculator.sum(5, 2));
		System.out.println(Calculator.sum(102.4, 504));
		System.out.println(Calculator.sum(102.4, 504, 56.1));
		//System.out.println(Calculator.sum(102.4, 504, "5"));
		
		
		//for all collections
		/*
		 * CRUD
		 * Create data
		 * Read data
		 * Update data
		 * Delete  data
		 * *looping through data
		 **/
		
		//List
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		System.out.println(colors);
		colors.add(0, "yellow");  //doesn't overwrite the first element but appends yellow as the new head
		System.out.println(colors);
		
		System.out.println(colors.get(2));
		//using remove and create to update
		//colors.remove(2);
		colors.add(2, "orange");
		System.out.println(colors);
		System.out.println(colors.get(2));
	
;		//Set
		Set<String> setColors = new HashSet<>(colors);
		setColors.add("Maroon");
		String search = "Maroon";
		String found = "";
		for (String str : setColors)
		{
			if (str.equals(found))
				found = str;
		}
		System.out.println(found);
		
		//Iterator examle
		Iterator<String> iter = setColors.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		setColors.remove("Maroon");
		System.out.println(colors);
		//Queue
			//polymorphism w/ interfaces
		
		List<String> listColors = new LinkedList<>(setColors);
		LinkedList<String> llColors = new LinkedList<String>(listColors);
		Queue<String> qColors = new LinkedList<>(llColors);
		Deque<String> dqColors = new LinkedList<>(llColors);		
		System.out.println("\nLL Prints");
		System.out.println(listColors.get(1));
		System.out.println(llColors.getLast());
		System.out.println(qColors.poll());
		System.out.println(qColors.poll());
		qColors.add("Purple");
		System.out.println(qColors);
		
		
		
		//Map
		Map<String, Double> coins = new HashMap<>();
		coins.put("Quarter", 0.25);
		coins.put("Dime", .10);
		coins.put("Nickle", .05);
		coins.put("Penny", .01);
		
		System.out.println(coins);
		System.out.println(coins.get("Dime"));
		System.out.println(coins.get("Doller")+"\n");
		
		
//		cannot directly loop through map
//		workaround
		for (String key : coins.keySet())
		{
			System.out.println(coins.get(key));
		}
	}
	
	

}
