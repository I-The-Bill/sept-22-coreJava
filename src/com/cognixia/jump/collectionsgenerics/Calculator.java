package com.cognixia.jump.collectionsgenerics;

public class Calculator 
{
	/*public static Integer sum(int input1,int input2) 
	{
		return input1 + input2;
	}
	
	public static Double  sum(Double input1, Double input2) 
	{
		return input1 + input2;
	}*/
	public static <N extends Number> double sum(N input1, N input2) 
	{
		
		return input1.doubleValue() + input2.doubleValue();
	}
	
	public static <N extends Number> Double sum(N...input)
	{
		double sum=0;
		try {
			for (N num: input)
			{
				sum+=num.doubleValue();
			}
		}
		catch (Exception e)
		{
			
		}
		return sum;
	}
}
