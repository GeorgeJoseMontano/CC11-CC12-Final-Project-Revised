import java.util.Scanner;

public class normalFormTime 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);						
		
		int T = input.nextInt();									//Get number of test cases
		
		int[] days = new int[T]; 									//Declare arrays for variables of time
		int[] hours = new int[T];
		int[] minutes = new int[T];
		int[] seconds = new int[T];
		
		//Input
		for(int i = 0; i < T; i++)									//Input each data in their own array
		{
			days[i] = input.nextInt();				
			hours[i] = input.nextInt();
			minutes[i] = input.nextInt();
			seconds[i] = input.nextInt();
		}
		
		input.close();
		
		//Output and Method Call
		for(int i=0;i<T;i++)
		{										
			System.out.print("Case #" + (i + 1) + ": ");
			convert(days[i], hours[i], minutes[i], seconds[i]);		//Extract each data and run them in method for conversion
		}		
		
	}
	
	//method for conversion
	static void convert(int d,int h,int m,int s)
	{																
			int temp;												//Create a temporary variable to hold carry values
			if (s >= 60)
			{														//Check if time value is greater than or equal to its max value
				temp = s / 60;										//Give the temp variable the amount to carry over to the next time variable
				m = m + temp;										//The next time variable will now have an add value of the carry
				s = s % 60;											//The time value will now only have the remainder as its value
			}
			if (m >= 60)
			{
				temp = m / 60;
				h = h + temp;
				m = m % 60;
			}
			if (h >= 24)
			{
				temp = h / 24;
				d = d + temp;
				h = h % 24;
			}
			print(d, h, m, s); //call print method
	}
	
	//method to print new values.
	static void print(int d,int h,int m,int s) 
	{		
			
		if(d > 0) //this is to avoid 0 values so that if a variable has 0 it will not be printed instead of 0 days 
		{
			System.out.print(d + " Day" + sPrint(d) + " ");
		}							
		if(h > 0)  
		{
			System.out.print(h + " Hour" + sPrint(h) + " ");
		}
		if(m > 0)
		{
			System.out.print(m + " Minute" + sPrint(m) + " ");
		}
		if(s > 0)
		{
			System.out.print(s + " Second" + sPrint(s) + " ");
		}
		System.out.println();
	}
	
	//method to print s only if the value is not 1. Example. 1 minute not 1 minutes
	static char sPrint(int a)
	{
		if (a != 1)
		{
			return 's';
		}
		else
		{
			return ' ';
		}
	}
}
