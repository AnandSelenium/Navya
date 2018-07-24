package javaPrograms;

public class InstanceVariablesIntialization {
	
	int empid;
	String empName;
	int salary;
	static String  CompanyName = "Google";
	
	public void initial(int empid,String empName,int sal) // non -static Method
	{
		this.empid = empid;
		this.empName = empName;
		CompanyName ="Facebook"; // direct access
		salary=sal; // Instance variable salary is assigned with local variable sal value
		
	}
	
	public void display() // non -static Method
	{
		System.out.println("EMpId: "+empid);
		System.out.println("EMpName: "+empName);
		System.out.println("Company Name: "+CompanyName);
		System.out.println("Salary: "+salary);
		
	}


	public static void main(String[] args) {
		
		InstanceVariablesIntialization emp = new InstanceVariablesIntialization();
		emp.initial(10, "Ravi", 40000);
		emp.display();
		emp.initial(20, "Priyanka", 50000); // old values 10, ravi , 40000 are replaced with new values in the heap memory
		emp.display();
		
		InstanceVariablesIntialization emp1= new InstanceVariablesIntialization(); // creating new copy of memory for id,name,salary in the heap with reference to emp1 object
		emp1.initial(30, "Navya", 60000);
		emp1.display();
		
		InstanceVariablesIntialization emp2= new InstanceVariablesIntialization(); // creating new copy of memory for id,name,salary in the heap with reference to emp1 object
		emp2.initial(40, "Usha", 80000);
		emp2.display();
		
		
	}

}
