package com.cognixia.jump.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemoDriver {

	public static void main(String[] args)
	{
		int[] primitive = {2,4,6,8,10,12,14,16};
		Integer[] primmy = new Integer[primitive.length];
		for(int i = 0; i < primmy.length;i++)
		{
			primmy[i] = primitive[i];
		}
		
			System.out.println("int array:" +  Arrays.toString(primitive));
			System.out.println("Integer array: " + Arrays.toString(primmy));	
			
			
		Integer[] intObjs = Arrays.stream(primitive).boxed().toArray(Integer[]::new);	
		
		System.out.println("Integer array: " + Arrays.toString(intObjs));
		
		List<Integer> numbers = Arrays.asList(primmy);
		
		System.out.println("For each example: ");
		numbers.forEach(System.out::println);
		
		numbers.forEach(n -> System.out.print(n + "FE "));
		
		
		int max = numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).get();
		
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Patt",100_000,"production"));
		employees.add(new Employee("Mand", 200_000, "Director"));
		employees.add(new Employee("Xavier",150_000, "Script Writing"));
		
		Employee lowest = employees.stream().reduce((e1,e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2).get();
		
		
		String searchvalue = "Mand";
		Optional<Employee> search = employees.stream().filter(e -> e.getName().equalsIgnoreCase(searchvalue)).findFirst();
		
		if(search.isEmpty())
		{
			System.out.println(search.get());
		}
		else {
			System.out.println(searchvalue + " not Found.");
		}
		
		if (search.isPresent())
		{System.out.println(search.get());}
		else {
			System.out.println(searchvalue + " not Found");
	
		}
		
		//.map applies a custom function to all entries in the stream
//		List<Employee> employeesAfterRaise = employees.stream()
//				.map(e -> e.getSalary()*2) //at this are not  we arn't working with stream of INTS
//				.collect(Collectors.toList());
		
		employees.forEach(e -> e.setSalary(e.getSalary()*2));
		
		System.out.println(employees);
	}

}
