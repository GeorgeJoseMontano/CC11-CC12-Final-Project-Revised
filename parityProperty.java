import java.util.Scanner;

public class parityProperty 
{	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);						
		int R,r,c;
		
		//INPUT
		System.out.println("Input: ");
		//Get number of test cases
		int T = input.nextInt();									
		
		//Array that will hold the return of method that took the input arrays
		boolean [] zeta = new boolean[T];									

		//Input
		for(int i = 0; i < T; i++)
		{											
			//Input for matrix dimensions
			R= input.nextInt();
			
			//Declare temporary matrix. This value will be passed to zeta[i] and will hold a new one
			int[][] A = new int [R][R];								
			
			for(r = 0; r < R; r++)
			{
				for(c = 0; c < R; c++)
				{
					//Input for matrix elements
					A[r][c]=input.nextInt();						
					
					//Check if input is either 1 or 0 Exit program if not 1 or 0
					if(A[r][c] != 1 && A[r][c] != 0)
					{			
						System.out.print("Wrong Input!!!");
						System.exit(0);
					}
				}
			}
			//Insert array input into method that will check sum of rows and columns
			//The boolean return will be given to zeta array at index
			zeta[i] = usb(A);											
		}
		input.close();
		
		//OUTPUT
		System.out.println("Output: ");
		for(int i = 0; i < T; i++)
		{										
			System.out.print("Case #" + ( i + 1) + ": ");
			//Checks value returned by method to determine if OK or NOT OK
			if(zeta[i])
			{											
				System.out.println("OK");
			}
			else
			{
				System.out.println("NOT OK");
			}
		}		
	}
		//Method that combines the result of checkRow and checkCol
		static boolean usb(int[][] a)
		{
			if(checkRow(a) && checkCol(a))
			{
				return true;
			}
			return false;
		}
		
		//Method to check sum of rows
		static boolean checkRow(int[][] a)
		{
			int sum = 0;
			for (int r = 0; r<a.length; r++)
			{
				for (int c = 0; c < a.length; c++)
				{			
					sum = sum + a[r][c];
				}
				if (sum % 2 != 0)
				{
					return false;
				}
			}
			return true;
		}
		
		//Method to check sum of columns
		static boolean checkCol(int[][] a)
		{
			int sum = 0;
			for (int c = 0; c<a.length; c++)
			{
				for (int r = 0; r < a.length; r++)
				{			
					sum = sum + a[r][c];
				}
				if (sum % 2 != 0)
				{
					return false;
				}
			}
			return true;
		}
		
}
