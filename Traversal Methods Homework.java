/**
 * This class is used to practice traversing arrays.
 * 
 * @author Jorrin Ikeno
 */
public class TraversalMethodsHomework
{

	public static void main(String[] args)
	{
		/* 
		 * Create an int array.
		 * 
		 * Precondition: The array must be at least length 1.
		 */
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		/* 
		 * Create a double array.
		 * 
		 * Precondition: The array must be at least length 1.
		 */
		double[] arr2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		/* 
		 * Call a method that is passed an int array and returns
		 * the highest value in that array.
		 */
		findHighestValue(arr);
		
		/*
		 * Call a method that is passed a double array and returns
		 * a double consisting of the average.
		 */
		findAverage(arr2);
		
		/*
		 * Call a method that is passed an int array and returns
		 * whether or not the array has any even numbers in it.
		 */
		findEvenNums(arr);
		
		/*
		 * Call a method that is passed an int array and returns
		 * whether or not all the elements in the array are even.
		 */
		findAllEvenNums(arr);
		
		/*
		 * Call a method that is passed a double array and returns
		 * whether or not three consecutive doubles of the same value
		 * appear in the array.
		 */
		checkThreeSame(arr2);
		
	}
	
	/**
	 * This method is passed an int array and returns
	 * the highest value in that array.
	 * 
	 * @param arr The passed int array.
	 * @return int high, which is stored the highest value in the array.
	 */
	public static int findHighestValue(int[] arr)
	{
		//Declare a traverser int.
		int traverser = 1;
		
		/* Declare an int to represent the
		 * highest value in the array.
		 * 
		 * Set its initial value equal to
		 * the first element in the array.
		 */
		int high = arr[0];
		
		//Create a for loop to traverse the array.
		for(; traverser < arr.length; traverser++)
		{	
			/* 
			 * Create an if statement to check if the current element
			 * is greater than high.
			 */
			if(arr[traverser] > high)
			{
				high = arr[traverser];
			}
		}
		
		/*
		 * Check by printing.
		 * 
		 * System.out.print(high);
		 */
		
		//Return the highest element.
		return high;
		
	}
	/**
	 * This method is passed an array of doubles and returns
	 * a double consisting of their average.
	 * 
	 * @param arr The passed double array.
	 * @return double avg, which is stored the average of each element in the array.
	 */
	public static double findAverage(double[] arr)
	{
		//Declare an int that represents the average.
		double avg = 0.0;
		
		//Create a for each loop.
		for(double i: arr)
		{
			avg += i;
		}
		
		//Divide double avg by the length of the array.
		avg /= arr.length;
		
		/*
		 * Check by printing.
		 * 
		 * System.out.println(avg);
		 */
		
		//Return average.
		return avg;
	}
	
	/**
	 * This method is passed an int array and returns
	 * whether or not the array has any even numbers in it.
	 * 
	 * @param arr The passed int array.
	 * @return boolean hasEven, which shows if there
	 * 	   is an even element in the array.
	 */
	public static boolean findEvenNums(int[] arr)
	{
		//Declare a traverser int.
		int traverser = 0;
		
		//Declare a boolean to determine if the element is even.
		boolean hasEven = false;
		
		//Create a for loop to traverse the array.
		for(; traverser < arr.length; traverser++)
		{	
			/* 
			 * Create an if statement to check if the current element
			 * is even.
			 */
			if(arr[traverser] % 2 == 0)
			{
				hasEven = true;
			}
		}
		
		/*
		 * Check by printing.
		 * 
		 * System.out.println(hasEven);
		 */
		
		//Return the boolean.
		return hasEven;
	}
	
	/**
	 * This method is passed an int array and returns whether or
	 * not the array has ALL even numbers in it.
	 * 
	 * @param arr The passed int array.
	 * @return boolean hasAllEven, which shows if all the elements
	 * 	   in the array are even.
	 */
	public static boolean findAllEvenNums(int[] arr)
	{
		//Declare a traverser int.
		int traverser = 0;
		
		//Declare a counter int to store the number of even elements.
		int numberOfEvens = 0;
		
		//Declare a boolean to determine if all the elements are even.
		boolean hasAllEven = false;
		
		//Create a for loop to traverse the array.
		for(; traverser < arr.length; traverser++)
		{
			/* 
			 * Create an if statement to check if the current element is
			 * even.
			 * 
			 * This should store the total number of even elements in int
			 * numberOfEvens.
			 */
			if(arr[traverser] % 2 == 0)
			{
				numberOfEvens++;
			}
			
			/* 
			 * Create an if statement to check if the counter's value is
			 * equal to the length of the array.
			 */
			if(numberOfEvens == arr.length)
			{
				hasAllEven = true;
			}
		}
		
		/*
		 * Check by printing.
		 * 
		 * System.out.println(hasAllEven);
		 */
		
		//Return the boolean.
		return hasAllEven;
	}
	
	/**
	 * This method is passed a double array and returns
	 * whether or not three consecutive doubles of the
	 * same value appear in the array.
	 * 
	 * @param arr The passed double array.
	 * @return boolean hasThree, which shows if there are
	 * 	   three consecutive same elements in the array.
	 */
	public static boolean checkThreeSame(double[] arr)
	{
		//Declare a traverser int.
		int traverser = 0;
		
		/*
		 * Declare a boolean to determine if the array has
		 * three consecutive doubles.
		 */
		boolean hasThree = false;
		
		//Create a for loop to traverse the array.
		for(; traverser < arr.length - 2; traverser++)
		{
			/* 
			 * Create an if statement to check if the current element
			 * is the same as the previous element and the next element.
			 */
			if(arr[traverser] == arr[traverser + 1] && arr[traverser] == arr[traverser + 2])
			{
				hasThree = true;
			}
		}
		
		/* 
		 * Check by printing.
		 * 
		 * System.out.println(hasThree);
		 */
		
		//Return the boolean.
		return hasThree;
	}
	
}
