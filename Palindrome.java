package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) 
	{
		 // a) Declare A String value as"madam"
		 String Input="madam";
		
		 // b) Declare another String rev value as ""
		 String RevString="";
		 
		 // c) Iterate over the String in reverse order
		for (int i = Input.length()-1; i >=0 ; i--) 
		{
			// d) Add the char into rev
			RevString+=Input.charAt(i);
			
		}
		 
		 // e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 if (Input.equals(RevString)) 
		 {
			 System.out.println(Input+" is a palindrome");
		 } 
		 else 
		 {
			 System.out.println(Input+" is not a palindrome. Reverse string is "+RevString);	
		}
	}

}
