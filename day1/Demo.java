package day1;
import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first numbers: ");
		int n1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2=sc.nextInt();
		//int n3=n1/n2;
		sc.close();
		
		try {
			System.out.println(n1/n2);
		}
		catch(ArithmeticException  e)
		{
			System.out.println("Any no does'nt divisible by 0");
		}
		System.out.println("End");
	}
	

}
