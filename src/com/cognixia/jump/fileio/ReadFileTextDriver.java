package com.cognixia.jump.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileTextDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("resources/temp.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			int charValue;// = br.read();
			while ((charValue = br.read()) != -1)
			{
				char letter = (char) charValue;
				System.out.print(letter);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				fr.close();
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}

	}
}