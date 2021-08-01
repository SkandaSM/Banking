package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class CSV  {

	public static  LinkedList<String[]> read(String file) {
		
		LinkedList<String[]>data=new LinkedList<>();
		
		try {
			  File file1=new File(file); //creates a new file instance
			  FileReader fr=new FileReader(file1); //reads the file 
			  BufferedReader br=new BufferedReader(new FileReader(file1)); //creates a buffering character input stream 
			 String dataRow =br.readLine();
			while(dataRow!=null) 
			{
				String[] datarecords=dataRow.split(",");
				data.add(datarecords);
				dataRow=br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Could not Find the FILE!!"+e);
		} catch (IOException e) {
			System.err.println("Could not Read the FILE!!"+e);			
		}	 
		return data;
	}
}
