package week1.day2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Declare String Input as Follow
		//String test = "changeme";
		String Input="changeme" ; 
		System.out.println("Before converting odd index to upper case:"+Input);
		
		// a) Convert the String to character array
		char[] InputArray=Input.toCharArray();
		System.out.print("After converting odd index to upper case:");
		
		// b) Traverse through each character (using loop)
		for (int i = 0; i < InputArray.length; i++) {
		
			// c)find the odd index within the loop (use mod operator)
			 if (i%2==1) 
			 {
			
				 // d)within the loop, change the character to uppercase, if the index is odd else don't change
				InputArray[i]=Character.toUpperCase(InputArray[i]);
			 }
			 
			 System.out.print(InputArray[i]);
		} 
		
		
		  
		
		
	}

}
