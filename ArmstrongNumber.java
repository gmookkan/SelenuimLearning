package week1.day1.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// Declare your input
		int input=153;
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int calculated,remainder,original;
		calculated=0;
		
		// Assign input into variable original 
		original=input;

		// Use loop to calculate: use while loop to set condition until the number greater than 0
		while(input>0)
		{
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			remainder=input%10;

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			input=input/10;
			
			System.out.print(calculated+" + "+" ( "+remainder+" * "+remainder+ " * "+remainder+") = ");
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			calculated+=remainder*remainder*remainder;
			System.out.println(calculated);
		}

		// Check whether calculated and original are same
		if(original==calculated)
		{
			//When it matches print it as Armstrong number
			System.out.println("Number "+original+" is an Armstrong number");
		}
		else
		{
			System.out.println("Number "+original+" is not an Armstrong number");
		}
	
	}

}
