package com.cognixia.jump.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class datetTimeTest 
{
	public static void main(String[] Args)
	{
		Date date;
		String x = "March 12 2012";
		try {
			date = new SimpleDateFormat("MM/dd/yy").parse(x);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
