package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input=13;

		// Declare a boolean variable flag as false
		boolean flag=false;
		
		// Iterate from 2 to half of the input
		for (int i = 2; i <= (input+1)/2; i++) 
		{
			// Divide the input with each for loop variable and check the remainder
			int remainder=input%i;
			
			// Set the flag as true when there is no remainder
			// break the iterator
			if (remainder==0) 
			{
				flag=true;
				break;
			}
			
		}

		// Check the flag (Provide a condition)
		if(!flag)
		{
			// Print 'Prime' when the condition matches
			System.out.println("Number "+input+ " is a prime number");
		}
		else
		{
			// Print 'Not a Prime' when the condition doesn't match 
			System.out.println("Number "+input+ " is not a prime number");
		}
	}

}
