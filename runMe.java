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
				JOptionPane.showMessageDialog(null,"Sample Input: \n"
						+ "5");
				JOptionPane.showMessageDialog(null,"Input on Console");
				towersOfHanoi.main(null);	
				break;
			case "2":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+"4 4\n"
													+"*...\n"
													+"....\n"
													+".*..\n"
													+"....\n");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running Minesweeper");
				minesweeper.main(null);
				break;
			case "3":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "1\n"
													+ "Juan dela Cruz\n"
													+ "Maria la del Barrio");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running FLAMES");
				flames.main(null);	
				break;
			case "4":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "3\n"
													+ "123 456\n"
													+ "555 555\n"
													+ "123 594");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running Primary Arithmetic");
				primaryArithmetic.main(null);	
				break;
			case "5":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "3\n"
													+ "8 3\n"
													+ "59 A7\n"
													+ "4fe 20");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running Base 16");
				base16.main(null);	
				break;
			case "6":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "4\r\n"
													+ "1234242352345234 78534534534\n"
													+ "35345 475467332\n"
													+ "2345345634636 234534512\n"
													+ "12367674 886235423345");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running Too Large to Handle");
				tooLargeToHandle.main(null);	
				break;
			case "7":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "2\n"
													+ "4\n"
													+ "1 0 1 0\n"
													+ "0 0 0 0\n"
													+ "1 1 1 1\n"
													+ "0 1 0 1\n"
													+ "5\n"
													+ "1 0 1 1 1\n"
													+ "1 0 0 0 0\n"
													+ "1 0 1 1 1\n"
													+ "0 0 0 0 1\n"
													+ "0 0 0 0 0");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running Parity Property");
				parityProperty.main(null);	
				break;
			case "8":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "3\n"
													+ "valid\n"
													+ "2ne1\n"
													+ "first#");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running New Programming Language");
				newProgrammingLanguage.main(null);	
				break;
			case "9":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "4\r\n"
													+ "5 49 33 0\r\n"
													+ "2 7 5 3573\r\n"
													+ "1 0 67 120\r\n"
													+ "5 2 43 15");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running Normal Form");
				normalFormTime.main(null);	
				break;
			case "10":
				JOptionPane.showMessageDialog(null,"Sample Input:\n"
													+ "3\n"
													+ "hello world\n"
													+ "foobar\n"
													+ "all about that bass");
				JOptionPane.showMessageDialog(null,"Input on Console");
				System.out.println("Running Reverse Words");
				reverseWords.main(null);	
				break;
			case "H":
			case "h":
				JOptionPane.showMessageDialog(null,"Choose a program you wish to run and enter corresponding number\n");
				JOptionPane.showMessageDialog(null,"A sample input dialog box will appear\n"
												+ "Input must be the same format as sample or as given on the pdf \n"
												+ "Be extra mindful of the format of your input \n"
												+ "Easier to just copy and paste input");
				JOptionPane.showMessageDialog(null,"Output will only show after when there is proper input");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
}
