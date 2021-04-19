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
		input.nextLine();
		
		String[] A = new String[n];
		char[][] B = new char[n][m];
		
		for(r=0;r<n;r++)
		{
			A[r] = input.nextLine();
		}
		input.close();
		
		for(r = 0; r < n; r++)
		{
			for(c = 0; c < m; c++)
			{
				B[r][c] = A[r].charAt(c);
			}
		}
		
		System.out.println();
		
		/*for(r=0;r<n;r++)
		{
			System.out.println(A[r]);
		}*/
		B = traverse(B,n,m);
		
		System.out.println("Output: ");
		for(r = 0; r < n; r++)
		{
			for(c = 0; c < m; c++)
			{
				System.out.print(B[r][c]);
			}
			System.out.println();
		}
	}
	
	static char[][] traverse(char array[][], int x, int y)
	{
		char[][] C = new char[x][y];
		//zero it all
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				
				C[i][j] = '0'; 
			}
		}
		
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				if( array[i][j] == '*')
				{
					C[i][j] = '*';
					
					if((i-1) >= 0 && (j-1) >= 0)
					{
						if(C[i-1][j-1] != '*')
						{
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
