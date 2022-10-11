package com.cognixia.jump.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TextReadWriteDriver {
	
//	Getting started on working with files and relative paths
	public static void main(String[] args) 
	{
		//using relative path b/c its generally the best thing to use because of file location
		String relativeFilePath = "resources/temp.txt";
		File file = new File(relativeFilePath);
		//This one reps a foldert directory
		File resourceFolder = new File("resources1");
		
		//check if file exist at relative path location specified
		System.out.println("Does the file " + relativeFilePath + " exist?: " + file.exists());
		
		//if file doesn't exist, make it 
		if (!file.exists())
		{
			try 
			{
				file.createNewFile();
				System.out.println("File made, see " + file.getName());
			}
			catch (IOException e) 
			{
				System.out.println("File " + file.getName() + 
								   " could not be created with the path " + file.getPath());
//				e.printStackTrace();
				if (!resourceFolder.exists())
				{
					if (resourceFolder.mkdir())
					{
						System.out.println("" + resourceFolder.getName() + " created");
					}
				}	
				System.out.println("Folder unable to be made");
					
			}
		}
			
	
		
		//Epoch is the beginning of time for computers
		System.out.println(file.getAbsolutePath());
		Date modified = new Date(file.lastModified());
		System.out.println(/*file.lastModified() +*/ "The last time the file waws modified was: " + modified);

	}

}
