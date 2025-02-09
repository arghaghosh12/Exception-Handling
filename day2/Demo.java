package day2;

class Demo {
	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Denomitaror");
		}
		catch(Exception e)
		{
			System.out.println("Super class handled");
		}
	}

}
