package customexception;

import java.util.Scanner;

class Login
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the user id: ");
		String userid=sc.nextLine();
		System.out.println("Enter the password: ");
		int password=sc.nextInt();
		sc.close();
		
		if(  password == 123)
		{
			System.out.println("Login Successfully");
		}
		else
		{

			try
			{
				throw new InvalidPasswordException("Kindly enter valid password");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		try
		{
			if (!userid.equals("Argha@123"))
			{
				throw new InvalidUserIdException("Pls enter valid id");
			}
			if(password!=123)
			{
				throw new InvalidPasswordException("pls enter valid password");
				
			}
			System.out.println("Log in successful");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
