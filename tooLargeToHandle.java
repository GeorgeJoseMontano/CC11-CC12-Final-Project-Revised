import java.util.Scanner;

public class tooLargeToHandle 
{
	//Create 3 stacks. Two for the two numbers and a third for their sum
	static OurListStack stack1 = new OurListStack();
	static OurListStack stack2 = new OurListStack();
	static OurListStack stack3 = new OurListStack();
	
	public static void main(String args[])
    {
		Scanner input= new Scanner(System.in);
		
		//Get number of test cases
		int T = input.nextInt();									
		
		//Input arrays
		String[] num1 = new String[T];								
		String[] num2 = new String[T];								
		
		//Input
		for(int i = 0; i < T; i++)
		{										
			num1[i] = input.next();
			num2[i] = input.next();
		}
		input.close();
		
		//Output
		for(int i = 0; i < T; i++)
		{										
			System.out.print("Case #" + (i + 1) + ": ");
			stackAdd(num1[i], num2[i]);
			printNumbers();
		}
		
	}
	
	//Method to add the two numbers
	static void stackAdd(String num1, String num2)
	{
		//Push each characters into their respective stacks
		for (int i=0; i<num1.length();i++)
		{
			stack1.push(num1.charAt(i));
		}
		for (int i=0; i<num2.length();i++)
		{
			stack2.push(num2.charAt(i));
		}
		
		//Create a variable with initial value of zero.
		//This will be the carried numbers
		int carry = 0;
		
		//Loop while one stack is still not empty
		while(!stack1.isEmpty() || !stack2.isEmpty())
		{
			int a, b, sum;
			
			//If shorter stack is empty this will give it 0 instead 
			if (stack1.isEmpty())
			{
				a = 0;
			}
			else
			{
				a = Character.getNumericValue(stack1.pop());
			}
			
			if (stack2.isEmpty())
			{
				b = 0;
			}
			else
			{
				b = Character.getNumericValue(stack2.pop());
			}
			
			//The remainder is pushed into a 3rd stack
			sum = (a + b + carry)%10;
			stack3.push(sum);
			
			//Check if there is a carry for the next sum
			if((a + b + carry) >= 10)								
			{
				carry = 1;
			}
			else
			{
				carry = 0;
			}
		}
	}
	
	//Method to print the sum of the two numbers
	static void printNumbers()
	{
		//Print out all elements of stack3
		while(!stack3.isEmpty())
		{
			System.out.print(stack3.pop());
		}
		System.out.println();
	}
	
}
