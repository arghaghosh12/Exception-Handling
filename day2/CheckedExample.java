package day2;
import java.io.*;
class CheckedExample {
	public static void main(String[] args) {
		//Unhandled exception type InteruptedException
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				//System.out.println("handeled");
				e.printStackTrace();
			}
		}
		
		//Unhandled exception type FileNotFoundException
		try {
		FileReader f=new FileReader("car.txt");
		}
		catch(Exception e)
		{
			//System.out.println("File not found");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
