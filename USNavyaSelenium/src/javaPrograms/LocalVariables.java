package javaPrograms;

public class LocalVariables {

	public static void main(String[] args) {
		
		int c;
		//System.out.println(c);
		int a=10; //local variable
		if(true)
		{
			int b=30;
		}
		//System.out.println(b);
		for(int i=0;i<2;i++) // i is lo
		{
			System.out.println(i);
			System.out.println(a);
			//System.out.println(b);
		}

		System.out.println(a);
		//System.out.println(i);
	}

}
