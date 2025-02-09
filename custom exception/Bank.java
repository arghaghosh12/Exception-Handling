package customexception;

import java.util.Scanner;

class Bank {
	static int balance=5000;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter amount to be withdrawn:");
		int amount=sc.nextInt();
		sc.close();
		
		if(amount<=balance)
		{
			System.out.println("Amount withdrawn Successful");
		}
		else
		{
			try
			{
				throw new InsufficientBalanceException("No sufficient balance !");
			}
			catch(InsufficientBalanceException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
