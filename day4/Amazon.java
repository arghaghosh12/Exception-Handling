package day5;

import java.util.Scanner;

class Amazon {
	static int egMarks=60;
	static void checkEligibility(int marks) throws InvalidMarksException
	{
		if(marks>=egMarks)
		{
			System.out.println("Apply for Amazon interview");
			
		}
		else
		{
			throw new InvalidMarksException("Better luck next time!!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks=sc.nextInt();
		
			try
			{
				checkEligibility(marks);
			}
			catch(InvalidMarksException e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				sc.close();
			}
		
	}

}
