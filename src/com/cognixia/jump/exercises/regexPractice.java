package com.cognixia.jump.exercises;

import java.util.regex.*;

  
public class regexPractice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String regex = "^[a-zA-z]+@cognixia.com$";
		Pattern pat = Pattern.compile(regex);
		String test = "as0fas@cognixia.com";
		Matcher matcher = pat.matcher(test);
		System.out.println("String matches: " +
				matcher.find()); // true

	}

}
