package javaPrograms;


public class Methods {


	public static void main(String[] args) {

		// Method Calling
		startMessage();
		String s = begin();
		System.out.println(s+" Happy to learn");
		sum(10,30);
		int i = sumWithReturnType(40,70);
		if(i>99)
		{
			System.out.println("It's 3 digit number");
		}
		
		if(i%2!=0)
		{
			System.out.println(i+"It's Odd Number");
			
		}
		else
		{
			System.out.println(i+" It's even Number");
		}

	}
	// Without Ret. Type and Without Arguments
	public static void startMessage()
	{
		System.out.println("Starting Program Execution....!");
	}

	// With Ret. Type and Without Arguments
	public static String begin()
	{
		return "Hello Selenium!";
	}

	// Without Ret. Type and Without Arguments
	public static void sum(int a, int b)
	{
		System.out.println("The sum of two numbers is :"+(a+b));
	}
	// With Ret. Type and With Arguments
	public static int sumWithReturnType(int a, int b)
	{
		return (a+b);
	}





}
