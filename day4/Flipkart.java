package day5;

import java.util.Scanner;

class Flipkart {
	static void checkOTP(int otp) throws InvalidOTPException 
	{
		if(otp==123)
		{
			System.out.println("Login Successful");
		}
		else
		{
			throw new InvalidOTPException("Invalid OTP!!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the OTP");
		int otp=sc.nextInt();
		try
		{
			checkOTP(otp);
			
		}
		catch(InvalidOTPException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			sc.close();
		}
		
	}

}
