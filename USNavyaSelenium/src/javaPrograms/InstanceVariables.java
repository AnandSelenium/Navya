package javaPrograms;

public class InstanceVariables {
	
	//Instance Variables Declaration (Heap Memory)
	
	public  int Number; //declaration but default value '0' is assigned in the memory
	
	public String name="Selenium";
	
	public float f=34f;

	
	public static int sNumber=70;  // static member  (class Memory)

	public static void main(String[] args) {
		
		String local="localVariable";
		
		System.out.println("static variable sNumber"+ sNumber);
		
		System.out.println(local);
		// Local Variables & objects (Stack Memory)
		InstanceVariables ivariables = new InstanceVariables(); // Object Creation 
		
		sNumber=90;
		System.out.println("static variable sNumber"+ sNumber);
		
		ivariables.Number =10;
		System.out.println(ivariables.Number);
	
		
		InstanceVariables ivariables1 = new InstanceVariables();
		ivariables1.Number =20;
		ivariables1.name="uft";
		ivariables1.f=3.14f;
		System.out.println(ivariables1.Number);
		
		
		local="loc";
		
		System.out.println(local);
		System.out.println("-----------test()----------------");
		test();
	
		
	}
	
	public static void test()
	{
		
		
		InstanceVariables ivariables = new InstanceVariables();
		ivariables.Number =20;
		ivariables.name="uft";
		ivariables.f=3.14f;
		System.out.println(ivariables.Number);
		
	}
	//Instance Variables Declaration

}
