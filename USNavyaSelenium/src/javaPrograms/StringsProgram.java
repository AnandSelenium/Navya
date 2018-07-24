package javaPrograms;

public class StringsProgram {

	public static void main(String[] args) {
		
		String s1 = "Selenium"; // String s1=new String("Selenium");
		
		String s2 = "  SeSlenium Automation   ";
		
		String s3 = "selenium Testing";
		
		
		
		System.out.println("Length of s1 is: "+s1.length()); //length of a String s1
		
		System.out.println("String s2 before trim() :"+s2); // String s2 before trim()
		
		s2= s2.trim();
		
		System.out.println("String s2 after trim() :"+s2); //String s2 after trim()
		
		s2= s2.replaceAll("Automation", "Webdriver");
		
		System.out.println("String s2 replace Automation substring with webdriver:"+s2);
		
		s2= s2.replaceAll("Webdriver", "").trim();
		
		System.out.println("String s2 remove Automation substring:"+s2);
		
		s2= s2.replaceFirst("S", "s").trim();
		
		System.out.println("String s2 replace S character with s:"+s2);
		
		s3 = s3.toUpperCase();
		System.out.println("uppercase of s3:"+s3);
		
		s3= s3.toLowerCase();
		System.out.println("lowerCase of s3:"+s3);
	}

}
