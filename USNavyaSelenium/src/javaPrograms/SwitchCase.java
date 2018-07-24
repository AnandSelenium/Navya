package javaPrograms;

public class SwitchCase {

	public static void main(String[] args) {
		
		int ch=11;
		
		/*if(ch==10)
		{
			//statements
		}
		else if(ch==20)
		{
			
		}
		else if(ch==30)
		{
			
		}
		else{
			
		}
		*/
		
		// switch with numbers
		/*
		switch(ch) // Expression or Value
		{
		case 10:
			System.out.println("Case 10");
			//you can add multiple Statements
			break;
			
		case 20:
			System.out.println("Case 20");
			//you can add multiple Statements
			break;
		case 30:
			System.out.println("Case 30");
			//you can add multiple Statements
			break;
		default:
			System.out.println("Default Case");
			//you can add multiple Statements
			break;
		}
		*/
		
		char c='u';
		//switch with char
		/*switch(c) // Expression or Value
		{
		case 'a':
			System.out.println("Case a");
			//you can add multiple Statements
			break;
			
		case 'e':
			System.out.println("Case e");
			//you can add multiple Statements
			break;
		case 'i':
			System.out.println("Case i");
			//you can add multiple Statements
			break;
		case 'o':
			System.out.println("Case o");
			//you can add multiple Statements
			break;
		case 'u':
			System.out.println("Case u");
			//you can add multiple Statements
			break;
		default:
			System.out.println("not an alphabet : " +c);
			//you can add multiple Statements
			break;
		}
		*/
		String s="postman";
		switch(s) // Expression or Value
		{
		case "selenium":
			System.out.println("Case selenium");
			//you can add multiple Statements
			break;
			
		case "uft":
			System.out.println("Case uft");
			//you can add multiple Statements
			break;
		case "protractor":
			System.out.println("Case protractor");
			//you can add multiple Statements
			break;
		case "appium":
			System.out.println("Case appium");
			//you can add multiple Statements
			break;
		case "codedUI":
			System.out.println("Case CodedUI");
			//you can add multiple Statements
			break;
		default:
			System.out.println("not an available tool : " +s);
			//you can add multiple Statements
			break;
		}
		
		

	}

}
