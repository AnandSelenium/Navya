package javaPrograms;

public class IfStatement {
	public static void main(String[] args) {
		
		//simple if
		
		int num=10;
		
		/*
		 if(num>=0)
		{
			System.out.println(num + " It's positive Number");
			
			
		}
		*/
		
		//if else block
		
		/*if(num%2==0)
		{
			System.out.println(num +" It's even Number");
		}
		else
		{
			System.out.println(num +" It's odd Number");
		}
		*/
		//else if ladder 
		
		int num1=20, num2=30;
		
		if(num>num1 && num>num2)
		{
			System.out.println(num +" is Big");
		}
		else if(num1>num && num1>num2)
		{
			System.out.println(num1 +" is Big");
		}
		else
		{
			System.out.println(num2 +" is Big");
		}
	
	}

}
