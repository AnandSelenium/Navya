package javaPrograms;

public class LoopingStatements {

	public static void main(String[] args) {
		
		// printing even numbers between 1 - 10 
	
		//for loop
		/*
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number :"+i);
			}
		}
		*/
		
		//while loop
		
		/*int x=2;
		while(x<=10)
		{
			System.out.println("Even Number : "+x);
			x=x+2;
		}
		*/
		//do while loop
		int d=-1;
		/*do
		{
			System.out.println("Positive Number:"+ d);
			d++;
		}while(d>0 && d<=10);*/
		
		while(d>0 && d<=10)
		{
			System.out.println("Positive  Number:"+ d);
			d++;
		}
		
	}

}
