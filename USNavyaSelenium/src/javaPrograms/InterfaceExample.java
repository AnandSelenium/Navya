package javaPrograms;


interface Bank
{
	int creditCardRepaymentDays=45; //if you  declare a instance variable, must define a value to it.
	
	static int accountClosingPeriod =15; //(days) if you  declare a static variable, must define a value to it.
	
	// add method declarations
	float personalLoanCalulator(float years,float amount);// Method Declaration
	
	float carLoan(float years,float totalAmount,float downPayment); // Method Declaration
	
	
}

class SBI implements Bank{
	int fixedDepositBaseRate =5; //days
	
	float roi=12;
	float  carRoi=9;
	
	float fixedDepositCal(float amount, int ageofCustomer, float period)
	{
		float tot=0;
		if(ageofCustomer<60)
		{
			tot =(float) (amount*(fixedDepositBaseRate+0.8f)*period)/100;
		}
		else
		{
			tot =(float) (amount*(fixedDepositBaseRate+3.8f)*period)/100;
		}
		return tot;
	}

	
	public float personalLoanCalulator(float years,  float amount) {
		
		float tot = (float)(amount*roi*years)/100;
		return tot;
	}

	
	public float carLoan(float years,float totalAmount, float downPayment) {
		
		float tot = (float)((totalAmount-downPayment)*carRoi*years)/100;
		return tot;
	}
	
	
	
}


public class InterfaceExample {


	public static void main(String[] args) {
		
		Bank b ; // we can create a reference only for Interface , can't be instantiated 
		
		SBI s = new SBI();
		
		float fixedDepositAmount = s.fixedDepositCal(1000000, 64, 5);
		System.out.println("Fixed Deposit : "+fixedDepositAmount);
		
		float personalLoanAmount = s.personalLoanCalulator(5, 500000);
		System.out.println("personalLoanAmount  : "+personalLoanAmount);
		
		float carLoanAmount = s.carLoan(6, 1000000, 200000);
		System.out.println("Car Loan Amount : "+carLoanAmount);
		
			
	}

}
