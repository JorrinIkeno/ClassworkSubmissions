/**
 * This class is used to practice Insertion Sort.
 * 
 * @author Jorrin Ikeno
 */
public class InsertionSort
{

	public static void main(String[] args)
	{
		//Declare an int array.
		int[] arr = {2, 5, 7, 8, 10, 6};
		
		//Declare an int index.
		int index = 4;
		
		//Declare a second int array.
		int[] arr2 = {2, 4, 6, 8, 5, 10, 12};
		
		//Declare a thrid int array.
		int[] arr3 = {6, 8, 5, 2, 10, 3, 12};
		
		/* 
		 * Create a method arrayShifter and
		 * pass it the int[] arr.
		 */
		arrayShifter(arr);
		
		/*
		 * Change the arrayShifter method and
		 * pass it an int index.
		 */
		arrayShifterTwo(arr2, index);
		
		/*
		 * Create a method insertionSort and
		 * pass it the int[] arr2.
		 */
		insertionSort(arr3);
	}
	
	/**
	 * When passed an array of ints, this method
	 * will take the last element and sort it into
	 * the right place.
	 * 
	 * Precondition: The array will be sorted except
	 * for the last element.
	 * 
	 * @param arr The passed array.
	 */
	public static void arrayShifter(int[] arr)
	{
		//Declare an int to store the last element.
		int i = arr.length - 1;
			
		/*
		 * Create a while loop to sort the elements.
		 */
		while(i > 0 && arr[i] < arr[i - 1])
		{
			//Create a placeholder int.
			int placeholder = arr[i - 1];
			
			//Swap the elements.
			arr[i - 1] = arr[i];
			
			arr[i] = placeholder;
				
			//Decrement int i.
			i--;	
		}
		
		//Call a method printArr.
		printArr(arr);
	}
	
	/**
	 * This method is passed an int index and will sort the value
	 * at that index instead of the last index.
	 * 
	 * Precondition: the rest of the array will be sorted.
	 * 
	 * @param arr2 The passed array.
	 * @param index The element in the array that will be sorted.
	 */
	public static void arrayShifterTwo(int[] arr2, int index)
	{
		/*
		 * Create a while loop to sort the elements.
		 */
		while(index > 0 && arr2[index] < arr2[index - 1])
		{
			//Create a placeholder int.
			int placeholder = arr2[index - 1];
					
			//Swap the elements.
			arr2[index - 1] = arr2[index];
					
			arr2[index] = placeholder;
						
			//Decrement int index.
			index--;	
		}
				
		//Call printArr.
		printArr(arr2);
	}
	
	/**
	 * This method is a copy of arrayShifterTwo to use with
	 * the insertionSort method.
	 * 
	 * @param arr3 The passed array.
	 * @param index The element in the array that will be sorted.
	 */
	public static void arrayShifterThree(int[] arr3, int index)
	{
		/*
		 * Create a while loop to sort the elements.
		 */
		while(index > 0 && arr3[index] < arr3[index - 1])
		{
			//Create a placeholder int.
			int placeholder = arr3[index - 1];
					
			//Swap the elements.
			arr3[index - 1] = arr3[index];
					
			arr3[index] = placeholder;
						
			//Decrement int index.
			index--;	
		}
				
		//Call printArr.
		printArr(arr3);
	}

	/**
	 * This method traverses the array and calls
	 * the arrayShifterTwo method inside.
	 * 
	 * @param arr2 The passed array.
	 * @param index The element in the array that will be sorted.
	 */
	public static void insertionSort(int[] arr3)
	{
		//Declare a traverser int.
		int traverser = 1;
		
		//Traverse the array.
		for(; traverser < arr3.length; traverser++)
		{
			//Call the arrayShifterTwo method.
			arrayShifterThree(arr3, traverser);
		}
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
		
		//Print the starting brace.
		System.out.print("{");
				
		//For loop to print each element in the array.
		for(; traverser <= arr.length - 1; traverser++)
		{
			//Print the current element.
			System.out.print(arr[traverser]);
					
			//If statement to ensure the current element isn't the final one.
			if(traverser != arr.length - 1)
			{
				System.out.print(", ");
			}
		}
				
		//Print the ending brace.
		System.out.println("}");
	
	}
}
