import java.util.Scanner;

class towersOfHanoi
{
	public static void main(String args[])
    {
		Scanner input = new Scanner(System.in);				
		
		//INPUT
		System.out.println("Input: ");
		int n = input.nextInt();							
		input.close();
		
		//OUTPUT and call method
		System.out.println("Output: ");
		//char name of the rods
		moveStacks(n, '1', '3', '2');
    }
	
    //method to solve towers of hanoi
    static void moveStacks(int n, char origin, char destination, char holder)
    {
        if (n == 1)
        {
        	//pretty much step 2 below since if it's the final disk it is the base
            System.out.println(origin + " --> " + destination);
            return;
        }
        else
        {
        	//minus 1 disk
        	n--;
        	
        	//steps to move all discs above the base disk to holder
	        moveStacks(n, origin, holder, destination);
	        
	        //step to move base disk to destination
	        System.out.println(origin + " --> " + destination);
	        
	        //steps to move all disks that were in holder to destination
	        moveStacks(n, holder, destination, origin);
        }
    }

}