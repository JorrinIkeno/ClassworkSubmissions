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
		
		//Print instructions.
		System.out.println("Input a String for the die. Ex: 13d2");
		
		//Set myDice to the String the user inputs.
		String myDice = myScan.nextLine();
		
		//Print instructions.
		System.out.println("Input a random letter sequence.");
		
		//Set myString to the letter sequence the user inputs.
		String myString = myScan.nextLine();
		
		//Print instructions.
		System.out.println("Input a letter in the sequence to find how many times it appears.");
		
		//Set myChar to the letter the user inputs.
		String myChar = myScan.nextLine();
		char myLetter = myChar.charAt(0);
		
		//Print instructions
		System.out.println("Whatever you put in will come out without spaces.");
		
		//Set userString to the String the user inputs.
		String userString = myScan.nextLine();
		
		System.out.println(changeString(userString));
		
		System.out.println("");
		
		//close the Scanner.
		myScan.close();
		
		//Create a method that points out the number and faces of a die.
		countNums(myDice);
		
		//Create a method with two formal parameters: a String object and a char.
		countChars(myString, myLetter);
		
		System.out.println(countChars(myString, myLetter));
		
		System.out.println("");
		
		//Create a method that passes a String and returns a different String
		//that is the same as the passed String without any spaces.
		changeString(userString);
		
		//Make a line that prints an int between 1 and 17 inclusive.
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
	
	/**
	 * This method should print the first and second numbers
	 * in a String such as 13d2.
	 * @param rollDice
	 */
	public static void countNums(String myDice)
	{			
		//Locate character 'd' in the input and store it as an int.
		int d = myDice.indexOf('d');
				
		//Locate the number of dice (to the left of 'd') and store it as a String.
		String a = myDice.substring(0,d);
				
		//Locate the number of faces on each die (to the right of 'd') and store it as a String
		String b = myDice.substring(d + 1);
				
		//Print the output.
		System.out.println("The first number is " + a + " and the second number is " + b + ".");
		
		System.out.println("");
		
		//Call rollDice to use a and b in the next method.
		int r = rollDice(a, b);
		
		System.out.println(r);
		
	}
	/**
	 * 	This method should print out the sum of the random numbers rolled on the dice.
	 * @param a
	 * @param b
	 */
	public static int rollDice(String amount, String faces)
	{	
		System.out.println("Your dice have landed on the following numbers:");
			
		//Make a line that prints an int between 1 and 'b' inclusive.
		//Roll it 'a' times.
		int sum = 0;
		
		for(int i = 1; i <= Integer.valueOf(amount); i++)
		{
			int x = 1 + (int) (Math.random() * Integer.valueOf(faces));
			
			sum += x;
			
			//Print the random numbers.
			System.out.println(x);
			
		}
		
		System.out.println("");
			
		//Print the sum of the random numbers.
		System.out.println("Rolling " + amount + " " + faces + "-sided dice results in a total of " + sum + ".");
		
		//Return the sum.
		return sum;
	}
