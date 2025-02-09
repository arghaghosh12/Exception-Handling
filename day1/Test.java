package day1;

class Test {
	public static void main(String[] args) {
		System.out.println("Start");
		int arr[]= {12,13,14,15};
		try
		{
			System.out.println(arr[20]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index");
		}
		System.out.println("End");

	}

}
