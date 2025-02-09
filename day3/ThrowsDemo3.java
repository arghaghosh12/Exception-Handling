package day3;

import java.io.FileNotFoundException;
import java.io.FileReader;

class ThrowsDemo3 {
	static void read() throws FileNotFoundException
	{
		FileReader fr =new FileReader("car.txt");
	}
	public static void main(String[] args) {
		try
		{
			read();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
	}

}
