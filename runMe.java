import java.util.Scanner;
import javax.swing.JOptionPane;

public class runMe {
static Scanner input = new Scanner(System.in);						
	
	public static void main(String[] args) 
	{
		System.out.println("Sample Problems 1 for Final Project");
		System.out.println("1. Towers of Hanoi	2. Minesweeper		3. FLAMES			4. Primary Arithmetic	5. Base 16 \n"
				+ "6. Too Large to Handle	7. Parity Property	8. New Programming Language	9. Normal Form		10. Reverse Form \n"
				+ "H. How to Use");
		System.out.println();
		String type = JOptionPane.showInputDialog("Enter Program to Run: ");					
		System.out.println();
		switch(type)
		{
			case "1":
				//towersOfHanoi.main(null);	
				break;
			case "2":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"+"4 4\n"+"*...\n"+"....\n"+".*..\n"+"....\n");
				System.out.println("Running Minesweeper");
				minesweeper.main(null);
				break;
			case "3":
				System.out.println("Running FLAMES");
				flames.main(null);	
				break;
			case "4":
				System.out.println("Running Primary Arithmetic");
				primaryArithmetic.main(null);	
				break;
			case "5":
				System.out.println("Running Base 16");
				base16.main(null);	
				break;
			case "6":
				System.out.println("Running Too Large to Handle");
				tooLargeToHandle.main(null);	
				break;
			case "7":
				System.out.println("Running Parity Property");
				parityProperty.main(null);	
				break;
			case "8":
				System.out.println("Running New Programming Language");
				newProgrammingLanguage.main(null);	
				break;
			case "9":
				System.out.println("Running Normal Form");
				normalFormTime.main(null);	
				break;
			case "10":
				System.out.println("Running Reverse Words");
				reverseWords.main(null);	
				break;
			case "H":
			case "h":
				JOptionPane.showMessageDialog(null,"Choose a program you wish to run and enter corresponding number\n");
				JOptionPane.showMessageDialog(null,"A sample input dialog box will appear\n"
												+ "Input must be the same format as sample or as given on the pdf \n"
												+ "Be extra mindful of the format of your input");
				JOptionPane.showMessageDialog(null,"Output will only show after when there is proper input");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
}
