package week1.day2.assignment;

public class RemoveDuplicates {


	public static void main(String[] args) {
		 // a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 
		 // b) Initialize an integer variable as count	  
			int count;
			
		 // c) Split the String into array and iterate over it 
		     String[] textArr=text.split(" ");
			 for (int i = 0; i < textArr.length; i++) 
			 {
				 count=1;
				 // d) Initialize another loop to check whether the word is there in the array
				for (int j = i+1; j < textArr.length; j++) 
				{
					// e) if it is available then increase and count by 1.
					if(textArr[i].equals(textArr[j]))
					{
						count++;

						 // f) if the count > 1 then replace the word as ""
						if(count>1)
						{
							textArr[j]="";
						}
					}
					
				}
				
			}

			 // g) Displaying the String without duplicate words	
			 for (int i = 0; i < textArr.length; i++) 
			 {
				 System.out.print(textArr[i]+" ");
			 }
	}

}
