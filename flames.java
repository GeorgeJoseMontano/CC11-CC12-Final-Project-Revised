import java.util.Scanner;

public class flames 
{
	
	public static void main(String args[])
    {

        Scanner input=new Scanner(System.in);							//Declare scanner
        
		int T = input.nextInt();										//Get the number of test cases
		input.nextLine();
		
		String[] name1 = new String[T]; 									//Declaration of variable for 1st Name
		String[] name2 = new String[T];									//Declaration of variable for 2nd Name
		
		for(int i=0;i<T;i++){
			//Input
			name1[i]=input.nextLine();
			name2[i]=input.nextLine();
		}
		
		input.close();
		
		for(int i=0;i<T;i++){											//Output
			System.out.print("Case #"+(i+1)+": ");
			cancel(name1[i],name2[i]);									//Call Method
		}			
	}
	static void test(String n1, String n2)
	{
		System.out.println(n1.replace(" ", ""));
		System.out.println(n2.replace(" ", ""));
	}

	static void cancel(String n1, String n2)
	{
		boolean check;
		int n1Length = n1.replace(" ", "").length();
		int n2Length = n2.replace(" ", "").length();
		
		String str1 = n1.replace(" ", "");
		String str2 = n2.replace(" ", "");
		
		Character[] array1 = new Character[n1Length];
		Character[] array2 = new Character[n2Length];
		OurListQueue queue1 = new OurListQueue();
		
		for(int i=0; i<n1Length; i++)
		{
			array1[i] = str1.charAt(i);
		}
		for(int i=0; i<n2Length; i++)
		{
			array2[i] = str2.charAt(i);
		}
		
		for(int i= 0; i<n1Length; i++)
		{
			check = true;
			for(int j= 0; j<n2Length; j++)
			{
				if(array1[i]==array2[j])
				{
					check = false;
				}
			}
			if (check == true)
			{
				queue1.enqueue(array1[i]);
			}
		}
		
		for(int i= 0; i<n2Length; i++)
		{
			check = true;
			for(int j= 0; j<n1Length; j++)
			{
				if(array2[i]==array1[j])
				{
					check = false;
					
				}
			}
			if (check == true)
			{
				queue1.enqueue(array2[i]);
			}
		}
		
		queue1.print();
		System.out.println(queue1.size());
		
		int loveValue = queue1.size() - 1;
		flamesCount(loveValue);
		
	}
	
	static void flamesCount(int love)
	{
		String apoy = "FLAMES";
		int cutIndex;
		while(apoy.length() != 1)
		{
			cutIndex = 0;
			for(int i = 0; i < love; i++)
			{
				if (love >= apoy.length())
				{
					cutIndex = 0;
				}
				cutIndex++;
			}
			apoy = apoy.substring(0,cutIndex - 1) + apoy.substring(cutIndex);
		}
		
		System.out.println(apoy);
		result(apoy);
	}
	
	static void result(String a)
	{
		switch(a)
		{													//Find out what the result when only one letter left
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
