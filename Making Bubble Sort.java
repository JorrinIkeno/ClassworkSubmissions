/**
 * This class is used to practice bubble sorting.
 * 
 * @author Jorrin Ikeno
 */
public class Making_Bubble_Sort
{

	public static void main(String[] args)
	{
		//Call a method 'makeRandom'.
		makeRandom();
	}
	
	/**
	 * This method should create a random number
	 * for each element up to 1000.
	 * 
	 * @return bigNums, which is the array that
	 * holds the elements being randomized.
	 */
	private static int[] makeRandom()
	{
		/* 
		 * Declare an int array 'bigNums' with
		 * a length of 2000 '0's.
		 */
		int[] bigNums = new int[2000];
		
		/* 
		 * Declare an int 'len' which stores
		 * the length of bigNums.
		 */
		int len = bigNums.length;
		
		//Create a for loop to traverse the array.
		for (int i = 0; i < len; i++)
		{
			/* 
			 * Declare an int 'randomNumber' that creates
			 * a random number between 1 and 1000.
			 */
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			
			//Assign a random number to the current element of the array.
			bigNums[i] = randomNumber;
		}

		
		//Call a method 'bubbleSort'.
		bubbleSort(bigNums);
		
		//Return the array.
		return bigNums;
	}
	
	/**
	 * This method should and return a totally new array
	 * that is a sorted version of the passed array.
	 * 
	 * @param arr The passed array bigNums.
	 * @param length The passed int len.
	 * @return
	 */
	public static int[] bubbleSort(int[] arr)
	{
		//int length = arr.length;
		
		//Create a copy of the array.
		int[] copyArr = arr;
		
		//Declare a traverser int.
		int traverser = 0;
		
		//Declare a placeholder int.
		int placeholder = 0;
		
		//Traverse the array.
		for(; traverser <= copyArr.length - 1; traverser++)
		{
			//Create a nested for loop to sort the array again.
			for(int traverser2 = 0; traverser2 < copyArr.length - 1; traverser2++)
			{
				/* 
				 * Create an if statement to account for
				 * if the current element is greater than
				 * the next element.
				 */
				if(copyArr[traverser2] >= copyArr[traverser2 + 1])
				{
					//Set 'placeholder' equal to the next element.
					int placeholder2 = copyArr[traverser2 + 1];
						
					//Swap the next element with the current element.
					copyArr[traverser2 + 1] = copyArr[traverser2];
					
					//Swap the current element and 'placeholder'.
					copyArr[traverser2] = placeholder2;
				}
			}
			
		}
		
		//Call a method 'printArr'.
		printArr(copyArr);
		
		//Return the arr.
		return copyArr;
	}
	
	/**
	 * This method is passed an array and prints out each
	 * element one by one.
	 * 
	 * @param arr The passed array.
	 */
	public static void printArr(int[] arr)
	{
		//Create a traverser int.
		int traverser = 0;
		
		/* 
		 * Create a for loop to print each element of the array.
		 */
		for(; traverser <= arr.length - 1; traverser++)
		{
			System.out.println(arr[traverser]);
		}
	}
}
