import java.util.Scanner;

public class base16 
{
	static OurListStackInt stack1 = new OurListStackInt();
	static OurListStackInt stack2 = new OurListStackInt();
	static OurListStackChar stack3 = new OurListStackChar();
	
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		
		//INPUT
      	System.out.println("Input:");
      	
		//Get number of test cases
		int T = input.nextInt();
		input.nextLine();
		
		//Input arrays
		String[] hex1 = new String[T];
		String[] hex2 = new String[T];
		
		//Input hexa
		for(int i = 0; i < T; i++)
		{										
			hex1[i] = input.next();
			hex2[i] = input.next();
		}
		input.close();
		
		//OUTPUT
		System.out.println("Output: ");
		for(int i = 0; i < T; i++)
		{
			System.out.print("Case #" + (i + 1) + ": ");
			pushToStack(hex1[i],hex2[i]);
			add();
			printStack3();			
		}		
	}
	
	//Method for turning string into characters 
	//Then pushing said characters into their respective stacks
	static void pushToStack(String x, String y)
	{
		for(int j = 0; j < x.length(); j++)
		{
			stack1.push(hexaConvert(x.charAt(j)));
		}
		
		for(int j = 0; j < y.length(); j++)
		{
			stack2.push(hexaConvert(y.charAt(j)));
		}
	}
	
	//Method to add the hexadecimal characters
	static void add()
	{
		int x, y, sum, carry = 0;
		
		//Do while loop was used in case of an extra carry 1
		do
		{
			//If shorter stack is empty this will give it 0 instead
			if (stack1.isEmpty())
			{
				x = 0;
			}
			else
			{
				x = stack1.pop();
			}
			
			if (stack2.isEmpty())
			{
				y = 0;
			}
			else
			{
				y = stack2.pop();
			}
			
			sum = x + y + carry;
			
			//As hexadecimal has a max of 16 characters any sum more than 16
			//Will produce a carry and 16 is subtracted from it
			if (sum >= 16)
			{
				sum = sum - 16;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			
			//Sum is converted into character then pushed into stack3
			stack3.push((hexaConvert2(sum)));
			
			//If there exists an extra carry it will be pushed into stack 3
			if (stack1.isEmpty() && stack2.isEmpty() && carry == 1) 
			{
				stack3.push('1');
			}
		}while(!stack1.isEmpty() || !stack2.isEmpty());
	}
	
	//Method to print stack 3 which holds the hexadecimal sum
	static void printStack3()
	{
		while(!stack3.isEmpty())
		{
			System.out.print(stack3.pop());
		}
		System.out.println();
	}
	
	//Method to convert character values of hexadecimal 
	//Into their integer counterparts
	static int hexaConvert(char x)
	{
		switch (x)
		{
			case '0':
				return 0;
			case '1':
				return 1;
			case '2':
				return 2;
			case '3':
				return 3;
			case '4':
				return 4;
			case '5':
				return 5;
			case '6':
				return 6;
			case '7':
				return 7;
			case '8':
				return 8;
			case '9':
				return 9;
			case 'A':
			case 'a':
				return 10;
			case 'B':
			case 'b':
				return 11;
			case 'C':
			case 'c':
				return 12;
			case 'D':
			case 'd':
				return 13;
			case 'E':
			case 'e':
				return 14;
			case 'F':
			case 'f':
				return 15;
		}
		return 0;
	}
	
	//Method to convert integer values of hexadecimal 
	//Into their character counterparts
	static char hexaConvert2(int x)
	{
		switch (x)
		{
			case 0:
				return '0';
			case 1:
				return '1';
			case 2:
				return '2';
			case 3:
				return '3';
			case 4:
				return '4';
			case 5:
				return '5';
			case 6:
				return '6';
			case 7:
				return '7';
			case 8:
				return '8';
			case 9:
				return '9';
			case 10:
				return 'A';
			case 11:
				return 'B';
			case 12:
				return 'C';
			case 13:
				return 'D';
			case 14:
				return 'E';
			case 15:
				return 'F';
		}
		return 0;
	}
	
	

}
