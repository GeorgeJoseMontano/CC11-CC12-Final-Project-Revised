/*
	Reverse Words

 	The Problem
	Given a list of space separated words, reverse the order of the words. Each line of text contains L
	letters and W words. A line will only consist of lower-case letters and space characters. There will be
	exactly one space character between each pair of consecutive words.
	Input
	The first line contains an integer T (1 <= T <= 100), the number of test cases. T test cases follow. Each
	test case will consist of a line of lower-case letters and space characters indicating a list of space
	separated words. Spaces will not appear at the start or end of a line. The number of characters in
	each line will not exceed 255.
	
	Output
	For each test case, output one line containing “Case #x: ” followed by the list of words in
	reverse order.
	
	Sample Input
	3
	hello world
	fish
	all about that bass
	
	Sample Output
	Case #1: world hello
	Case #2: fish
	Case #3: bass that about all 
 */
import java.util.Scanner;
 

public class reverseWords 
{
	public static void main(String args[])
	{	
		Scanner input = new Scanner(System.in);				//Declare scanner
		int T = input.nextInt();							//Get number of test cases
		input.nextLine();
		String[] str=new String[T];							//Declaration of variable string array that will accept inputs
		
		for(int i=0;i<T;i++)
		{													//Input
			str[i]=input.nextLine();
		}
		input.close();
		
		for(int i=0;i<T;i++)
		{													//Output
			System.out.print("Case #"+(i+1)+": ");
			splitter(str[i]);								//Call Method
		}
	}

    static void splitter(String str)
    {    
        OurListStackString stack = new OurListStackString();			//Create a stack called stack 
        
        String[] arrOfStr = str.split(" ");					//split(" ") method will split a string in spaces' position and insert them into an array 
        
        for (String a : arrOfStr) 							//For-each loop
        {
        	stack.push(a);									//Each elements in array push into a stack
        }
        
        while(!stack.isEmpty())								//Loop while the stack is not empty
        {
        	System.out.print(stack.pop()+ " ");				//Pop the string
        }
        System.out.println();
        
       
    }
}