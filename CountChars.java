/**
 * This class will simulate the experience of rolling a dice.
 * Each roll should bring about a random number.
 * @author Jorrin Ikeno
 */

import java.util.Scanner;

public class DiceRoller
{

	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		
		//Set myString to the letter sequence the user inputs.
		String myString = myScan.nextLine();
		
		//Set myChar to the letter the user inputs.
		String myChar = myScan.nextLine();
		char myLetter = myChar.charAt(0);
		
		//close the Scanner.
		myScan.close();
		
		//Create a method with two formal parameters: a String object and a char.
		countChars(myString, myLetter);
		
		System.out.println(countChars(myString, myLetter));
		
		//Task 1: Make a line that prints an int between 1 and 17 inclusive.
		//Roll it 200 times.
		for(int i = 1; i <= 200; i++)
		{
			int x = 1 + (int) (Math.random() * 17);
			
			System.out.println(x);
		}
		
	}

	/**
	 * This method should count how many times the char shows up in the String,
	 * and return that number.
	 * @param myString
	 * @param myChar
	 */
	public static int countChars(String myString, char myChar)
	{	
		
		int count = 0;
		
		//Create a for loop to read the String.
		for(int i = 0; i < myString.length(); i++)
		{
			//Check if char at current index equals myChar.
			if(myString.charAt(i) == myChar)
			{
				count++;
			}
			
		}
		
		return count;
	}

}
