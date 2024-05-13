/**
 * This class is used to help practice recursion.
 * 
 * Recursion is the idea that a method can be passed
 * to itself, making the method run again.
 * 
 * @author Jorrin Ikeno
 */
import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args)
	{
		/*
		 * Call a method stupidNumberSayer().
		 */
		stupidNumberSayer();
	}
	
	/**
	 * This method is static, void, and has
	 * no formal parameters.
	 * 
	 * It determines if the inputted number is
	 * "777" or not.
	 */
	public static void stupidNumberSayer()
	{
		//Open a Scanner object.
		Scanner myScan = new Scanner(System.in);
		
		//Allow the user to enter a number.
		int num = myScan.nextInt();
		
		/*
		 * Check if the number entered was "777"
		 * and if it is, simply print out
		 * "That is a good number." and close the
		 * scanner object.
		 */
		if(num == 777)
		{
			System.out.println("That is a good number.");
			
			myScan.close();
		}
		
		/*
		 * If the number is anything else, instead print
		 * "That is a stupid number!" and close the
		 * scanner, and also then call stupidNumberSayer().
		 */
		else
		{
			System.out.println("That is a stupid number!");
			
			stupidNumberSayer();
		}
	}

}
