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
		System.out.println("Output: ");
		moveStacks(n, '1', '3', '2');  // A, B and C are names of rods
    }
    // Java recursive function to solve tower of hanoi puzzle
    static void moveStacks(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println(from_rod + " --> " + to_rod);
            return;
        }
        moveStacks(n-1, from_rod, aux_rod, to_rod);
        System.out.println(from_rod + " --> " + to_rod);
        moveStacks(n-1, aux_rod, to_rod, from_rod);
    }
      
    //  Driver method
    
}