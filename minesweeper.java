import java.util.Scanner;

public class minesweeper {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);						
		int r,c;

		System.out.println("Input:");
		
		//Get number of dimensions
		int n = input.nextInt();
		int m = input.nextInt();
		//fix auto line skip when reading string after reading int
		input.nextLine(); 
		
		//Array to hold the lines as string
		String[] A = new String[n];
		//2D Array to hold char extracted from string
		char[][] B = new char[n][m];
		
		//INPUT
		//Input lines as string
		for(r=0;r<n;r++)
		{
			A[r] = input.nextLine();
		}
		input.close();
		
		//Convert the strings to individual characters and store in 2D array
		for(r = 0; r < n; r++)
		{
			for(c = 0; c < m; c++)
			{
				B[r][c] = A[r].charAt(c);
			}
		}
		System.out.println();
		
		//Call method and reuse the 2D array with modified version of its original
		B = traverse(B,n,m);
		
		//OUTPUT
		System.out.println("Output: ");
		//Print 2D array with new values
		for(r = 0; r < n; r++)
		{
			for(c = 0; c < m; c++)
			{
				System.out.print(B[r][c]);
			}
			System.out.println();
		}
	}
	
	//Method to replace the values in array with numeric values that shows
	//Number of mines near that index
	static char[][] traverse(char array[][], int x, int y)
	{
		//Make a new array to place numeric values
		char[][] C = new char[x][y];
		//Zero all indexes to create 'base' numeric value
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				C[i][j] = '0'; 
			}
		}
		
		//Iterate through the original array searching for '*'/ mines
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				//If a mine is found copy that index location and create a
				// mine in the new 2D array at that location
				if( array[i][j] == '*')
				{
					C[i][j] = '*';
					
					//After placing a mine at that location place 1 on indexes around it
					//To show there is a mine next to them.
					//These if statements are just to check if that index is not outside
					if((i-1) >= 0 && (j-1) >= 0)
					{
						//Also checks if it contains a mine as to not replace the mine with number
						if(C[i-1][j-1] != '*')
						{
							//The base '0' or number is converted to int then added 1 then the sum is converted
							//back to a character and stored in that position.
							C[i-1][j-1] = Character.forDigit((Character.getNumericValue(C[i-1][j-1]) + 1), 10);
						}
					}
					if((i-1) >= 0)
					{
						if(C[i-1][j]  != '*')
						{
							C[i-1][j] = Character.forDigit((Character.getNumericValue(C[i-1][j]) + 1), 10);
						}
					}
					if((i-1) >= 0 && (j+1) < y)
					{
						if(C[i-1][j+1] != '*')
						{
							C[i-1][j+1] = Character.forDigit((Character.getNumericValue(C[i-1][j+1]) + 1), 10);
						}
					}
					
					if((j-1) >= 0)
					{
						if(C[i][j-1] != '*')
						{
							C[i][j-1] = Character.forDigit((Character.getNumericValue(C[i][j-1]) + 1), 10);
						}
					}
					if((j+1) < y)
					{
						if(C[i][j+1] != '*')
						{
							C[i][j+1] = Character.forDigit((Character.getNumericValue(C[i][j+1]) + 1), 10);
						}
					}
					if((i+1) < x && (j-1) >= 0)
					{
						if(C[i+1][j-1] != '*')
						{
							C[i+1][j-1] = Character.forDigit((Character.getNumericValue(C[i+1][j-1]) + 1), 10);
						}
					}
					if((i+1) < x)
					{
						if(C[i+1][j] != '*')
						{
							C[i+1][j] = Character.forDigit((Character.getNumericValue(C[i+1][j]) + 1), 10);
						}
					}
					if((i+1) < x && (j+1) < y)
					{
						if(C[i+1][j+1] != '*')
						{
							C[i+1][j+1] = Character.forDigit((Character.getNumericValue(C[i+1][j+1]) + 1), 10);
						}
					}
				}
			}
		}
		return C;
	}


}
