import java.util.Scanner;

public class flames 
{
	//Queue to hold the characters the two names don't share
	static OurListQueue queue1 = new OurListQueue();
	public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        //INPUT
      	System.out.println("Input:");
      	
        //Get the number of test cases
		int T = input.nextInt();										
		input.nextLine();
		
		//String arrays to hold the two names
		String[] name1 = new String[T]; 									
		String[] name2 = new String[T];								
		
		//Input for the two names
		for(int i = 0; i < T; i++)
		{	
			name1[i]=input.nextLine();
			name2[i]=input.nextLine();
		}
		input.close();
		
		//OUTPUT
		System.out.println("Output: ");
		for(int i = 0; i < T; i++)
		{											
			System.out.print("Case #" + (i + 1) + ": ");
			//Call Method
			cancel(name1[i], name2[i]);								
		}			
	}
	/*static void test(String n1, String n2)
	{
		System.out.println(n1.replace(" ", ""));
		System.out.println(n2.replace(" ", ""));
	}*/

	//Method that cancels letters that both names share
	static void cancel(String n1, String n2)
	{		
		//Remove the space from the names
		String str1 = n1.replace(" ", "");
		String str2 = n2.replace(" ", "");
		
		//Length of the names without spaces
		int n1Length = str1.length();
		int n2Length = str2.length();
		
		//Extract individual characters from their string and store in
		//Their respective arrays
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();	
		
		//Pass the values to a new  method
		loveQueue(array1, array2, n1Length, n2Length);
		loveQueue(array2, array1, n2Length, n1Length);
		
		//Love value will be the number of stored letters or size of the queue
		int loveValue = queue1.size();
		//System.out.println(loveValue); - TESTER
		
		flamesCount(loveValue);
		
	}
	
	//Method that removes shared letters and stores the leftover in a queue
	static void loveQueue(char A[], char B[], int n1L, int n2L)
	{
		//create a control boolean
		boolean check;
		
		//Each letter of the first word is compared to each letter in second
		for(int i = 0; i < n1L; i++)
		{
			
			check = true;
			for(int j = 0; j < n2L; j++)
			{
				//If it's a match then the control will be false and letter will not be stored
				if(A[i] == B[j])
				{
					check = false;
				}
			}
			//If control is true that letter is not shared and therefore stored in a queue
			if (check == true)
			{
				queue1.enqueue(A[i]);
			}
		}
	}
	
	//Method to iterate over FLAMES
	static void flamesCount(int love)
	{
		String apoy = "FLAMES";
		
		while(apoy.length() != 1)
		{
			//Index of the letter that will be removed
			//Always start at zero
			int cutIndex = 0;
			
			//Loop that will iterate which index to cut
			for(int i = 1; i <= love; i++)
			{
				//If the index passes the length of flames or what's left of the string
				//Return its value back to zero and continue from there
				if (cutIndex >= apoy.length())
				{
					cutIndex = 0;
				}
				cutIndex++;
			}
			//Remove the character using substring
			apoy = apoy.substring(0,cutIndex - 1) + apoy.substring(cutIndex);
			apoy = apoy.trim();
		}
		
		//System.out.println(apoy); - TESTER
		//Pass the remaining letter to method
		result(apoy);
	}
	
	//Method that will show the result based on the 
	static void result(String a)
	{
		switch(a)
		{													
		  case "F":
			  System.out.println("Friends");
			  break;
		  
		  case "L":
			  System.out.println("Lovers");
			  break;
		  
		  case "A":
			  System.out.println("Acquaintance");
			  break;
		  
		  case "M":
			  System.out.println("Married");
			  break;
		  
		  case "E":
			  System.out.println("Enemies");
			  break;
		  
		  case "S":
			  System.out.println("Sweethearts");
			  break;
		  
		  default:
			  System.out.println("Error");
		}
	}
		
}
