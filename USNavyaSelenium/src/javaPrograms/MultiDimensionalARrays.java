package javaPrograms;

public class MultiDimensionalARrays {

	public static void main(String[] args) {
		int marks[][] = new int[2][6];
		
		System.out.println("Row Length:"+marks.length); // prints rows length 2
		System.out.println("Coumn Length:"+marks[0].length); // prints 1st row total no.of columns
		
		// Assigning random values to the array
		for(int i=0;i<marks.length;i++)  //2
		{
			
			for(int j=0;j<marks[i].length;j++)  //6
			{
				
				marks[i][j] = i+j;
			}
		}
		
		
		// Printing the array values 
		for(int i=0;i<marks.length;i++)  //2
		{
			
			for(int j=0;j<marks[i].length;j++)  //6
			{
				
				System.out.print(marks[i][j]+"     "); 
			}
			System.out.println();
		}
		
	}

}
