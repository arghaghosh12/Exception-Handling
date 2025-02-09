package day3;

public class ThrowsDemo1 {
	static void div() throws ArithmeticException
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			div();//Method Caller
		}
		catch( ArithmeticException e)
		{
			System.out.println("Invalid Denominator");
		}
		System.out.println("End");
	}

}
