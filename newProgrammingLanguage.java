import java.util.Scanner;

public class newProgrammingLanguage 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);						
		
		//Get number of test cases
		int T = input.nextInt();									
		
		//Array that will hold the string
		String[] str = new String[T];								

		//Input
		for(int i = 0; i < T; i++)
		{										
			str[i] = input.next();
		}
		input.close();

		//Output and Method Call
		for(int i = 0; i < T; i++)
		{										
			System.out.print("Case #" + (i + 1) + ": ");
			valid(str[i]);
		}
	}
	
	//Method to print valid or not valid depending on boolean value of checkChars method
	static void valid(String str)
	{
		if(checkChars(str))
		{											
			System.out.println(" VALID");
		}
		else{
			System.out.println(" NOT VALID");
		}
	}
		
	static boolean checkChars(String str)
	{        
		//Loop to check each character of the string
        for(int i = 0; i < str.length(); i++) 
        {		
        	//Character variable to hold the character at current index of string
        	char x = str.charAt(i);
        	
        	//Check if char is 'not' a letter, #, _ or number
            if (!Character.isLetter(x) 
            		&& x != '#' 
            		&& x != '_' 
            		&& !Character.isDigit(x)) 
            {		
				return false;
			}
			
            //Check if character is an even number 
			if ( Character.isDigit(x) ) 
			{		//Check if character is an even number
				if(x % 2 != 0)
				{
					return false;
				}
			}
			
			//Check if first character is a number
			if ( i==0 && Character.isDigit(x) )
			{					
				return false;
			}
			
			//Check if string length is greater than 20
			if (str.length() > 20)
			{										
				return false;
			}
        }
        return true;
	}
}
