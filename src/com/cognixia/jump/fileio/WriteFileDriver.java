package com.cognixia.jump.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileDriver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File file = null;
		FileWriter fileWriter = null;
		BufferedWriter buffWriter = null;
		PrintWriter printWriter = null;
		
		try 
		{
			file = new File("resources/temp.txt");
			if (file.exists())
			{
				fileWriter = new FileWriter(file,true);
				buffWriter = new BufferedWriter(fileWriter);
				printWriter = new PrintWriter (buffWriter);
			}
			
			//creating helper methods below to see different ways to write files
			
			writeToFile(buffWriter, "Hello");
			appendToFile(buffWriter, "New String Added");
			writeWithPrintWriter(printWriter, "printWrittr wrote this");
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			if (buffWriter != null)
			{
				try 
				{
					buffWriter.close();
				} 
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fileWriter != null)
			{
				try 
				{
					fileWriter.close();
				} 
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (printWriter != null)
			{
				printWriter.close();
			}
		}
	}

	private static void writeWithPrintWriter(PrintWriter pw, String s) 
	{
		// TODO Auto-generated method stub
		pw.println();
		pw.print(s);
		pw.println(s);
		pw.println(s);
	}

	private static void appendToFile(BufferedWriter bw, String s) throws IOException 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++)
		{
			bw.append("\n" + s);
		}
	}

	private static void writeToFile(BufferedWriter bw, String s) throws IOException 
	{
		for (int i = 0; i < 3; i++)
		{
			bw.write(s);
		}
	}

}
