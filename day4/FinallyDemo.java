package day5;

class FinallyDemo
{
	public static void main(String[] args)
	{
		System.out.println("start");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid denominator");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		
		System.out.println("End.");
	}

}
