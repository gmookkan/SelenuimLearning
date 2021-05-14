package week1.day2.assignment;

public class ReverseEvenWord {

	public static void main(String[] args) {
		 // Declare the input as Follow
			String test = "I am a software tester"; 
   		
		//a) split the words and have it in an array
			String[] word=test.split(" ");
			
		//b) Traverse through each word (using loop)
			for (int i = 0; i < word.length; i++) 
			{
				
				//c) find the odd index within the loop (use mod operator)
				if(i%2==1)
				{
					//d)split the words and have it in an array
					char[] wordArray=word[i].toCharArray();
					
					//e)print the even position words in reverse order using another loop (nested loop)
					for (int j = wordArray.length-1; j >= 0 ; j--) 
					{
						System.out.print(wordArray[j]);
						
					}
					System.out.print(" ");
				}
				else
				{
				
					//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
					System.out.print(word[i]+" ");

				}
								
			}
		
	
		
	
		
		
	}

}
