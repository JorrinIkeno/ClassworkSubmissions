/**
 * This class is used to practice traversing 2D arrays.
 * 
 * @author Jorrin Ikeno
 */
public class TwoDArrayTraversal
{

	public static void main(String[] args)
	{
		/*
		 * Task 1: Declare a 2D array of Strings
		 * with 7 rows and 6 columns. 
		 */
		String[][] arr = { {"a", "b", "c", "d", "e", "f"},
						   {"g", "h", "i", "j", "k", "l"},
						   {"m", "n", "o", "p", "q", "r"},
						   {"s", "t", "u", "v", "w", "x"},
						   {"y", "z", "a", "b", "c", "d"},
						   {"e", "f", "g", "h", "i", "j"},
						   {"k", "l", "m", "n", "o", "p"} } ;
		
		/*
		 * Task 2: One by one, print out the first
		 * element in each row, from top to bottom. 
		 */
		
		/*
		 * System.out.println(arr[0][0]);
		 * System.out.println(arr[1][0]);
		 * System.out.println(arr[2][0]);
		 * System.out.println(arr[3][0]);
		 * System.out.println(arr[4][0]);
		 * System.out.println(arr[5][0]);
		 * System.out.println(arr[6][0]);
		 */
		
		
		/*
		 * Task 3: The code from Task 2 looks like
		 * it could be done using a loop. Use a loop
		 * to print out each row's first element. 
		 * 
		 * When traversing 2D arrays down a column,
		 * it is called a "column-major order" traversal.
		 */
		for(int traverser = 0; traverser < arr.length; traverser++)
		{
			System.out.println(arr[traverser][0]);
		}
		
		/*
		 * Task 4: One by one, print out each element
		 * in the first row only, from left to right. 
		 */
		
		/*
		 * System.out.println(arr[0][0]);
		 * System.out.println(arr[0][1]);
		 * System.out.println(arr[0][2]);
		 * System.out.println(arr[0][3]);
		 * System.out.println(arr[0][4]);
		 * System.out.println(arr[0][5]);
		 * System.out.println(arr[0][6]);
		 */
		
		System.out.println("");
		
		/*
		 * Task 5: Huh, that last task also looks like
		 * it could be done using a loop. Please use a
		 * loop to print out each element in the first row. 
		 * 
		 * When traversing 2D arrays down a row,
		 * it is called a "row-major order" traversal.
		 */
		for(int traverser = 0; traverser < arr.length - 1; traverser++)
		{
			System.out.println(arr[0][traverser]);
		}
		
		System.out.println("");
		
		/*
		 * Task 6: Copy your code from task 3 and paste it
		 * wherever you are doing this task. Edit it so it
		 * prints every element in each row, instead of just
		 * the first element.
		 * 
		 * Hint: first, make it print the first AND second
		 * elements of each row. Then make it print the first,
		 * second, AND the third element of each row. See a pattern?
		 * If you turn this code into a loop, your nested loops will
		 * print out every element.
		 */
		for(int traverser = 0; traverser < arr.length; traverser++)
		{
			for(int traverser2 = 0; traverser2 < arr.length - 1; traverser2++)
			{
				System.out.println(arr[traverser][traverser2]);
			}
		}
	}

}
