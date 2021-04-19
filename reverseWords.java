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
		Scanner input = new Scanner(System.in);				
		
		//INPUT
		System.out.println("Input: ");
		
		//Get number of test cases
		int T = input.nextInt();							
		input.nextLine();
		
		//String array that will accept inputs
		String[] str=new String[T];							
		
		//Input string
		for(int i=0;i<T;i++)
		{													
			str[i]=input.nextLine();
		}
		input.close();
		
		//OUTPUT
		System.out.println("Output: ");
		for(int i=0;i<T;i++)
		{													
			System.out.print("Case #"+(i+1)+": ");
			splitter(str[i]);								
		}
	}

    static void splitter(String str)
    {    
      OurListStackString stack = new OurListStackString();			 
        
      //split(" ") method will split a string in spaces' position and insert them into an array
      String[] arrOfStr = str.split(" ");					 
        
      //For-each loop to push each array into a stack
      for (String a : arrOfStr) 							
      {
    	  stack.push(a);									
      }
      
      //Use a stack to reverse order of the string
      while(!stack.isEmpty())								
      {
    	  System.out.print(stack.pop()+ " ");	
      }
      System.out.println();
        
       
    }
}