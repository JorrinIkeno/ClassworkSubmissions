/**
 * This class is used to practice both ArrayLists and bubble sort.
 * 
 * @author Jorrin Ikeno
 */
import java.util.ArrayList;

public class ArrayListSorters
{

	public static void main(String[] args)
	{
		//Instantiate Integer ArrayList nums.
		ArrayList <Integer> nums = new ArrayList <Integer>();
		
		//Fill the ArrayList with five unsorted values.
		nums.add(2);
		nums.add(5);
		nums.add(4);
		nums.add(1);
		nums.add(3);
		
		//Instantiate String ArrayList names.
		ArrayList <String> names = new ArrayList <String>();
		
		//Fill the ArrayList with five unsorted values.
		names.add("Mika");
		names.add("Reef");
		names.add("Jackson");
		names.add("Donovan");
		names.add("Bladen");
		
		/* 
		 * Create a void method bubbleSortNumbers that is
		 * passed an ArrayList and bubble sorts it.
		 */
		bubbleSortNumbers(nums);
		
		/*
		 * Create a void method bubbleSortStrings that is
		 * passed an ArrayList and bubble sorts it.
		 */
		bubbleSortStrings(names);
	}
	
	/**
	 * This method should bubble sort the Integers within the
	 * ArrayList nums.
	 * 
	 * @param nums The passed ArrayList.
	 */
	public static void bubbleSortNumbers(ArrayList <Integer> nums)
	{
		//Declare a traverser int.
		int traverser = 0;
				
		//Declare a placeholder int.
		int placeholder = 0;
				
		//Traverse the array.
		for(; traverser <= nums.size() - 1; traverser++)
		{
			//Create a nested for loop to sort the array again.
			for(int traverser2 = 0; traverser2 < nums.size() - 1; traverser2++)
			{
				/* 
				 * Create an if statement to account for
				 * if the current element is greater than
				 * the next element.
				 */
				if(nums.get(traverser2) >= nums.get(traverser2 + 1))
				{
					//Swap the next element with the current element.
					placeholder = nums.set(traverser2, traverser2 + 1);
						
					//Swap the current element and 'placeholder'.
					nums.set(traverser2 + 1, placeholder);
				}
			}
		}
		
		//Print the ArrayList.
		System.out.println(nums);
	}
	
	/**
	 * This method should bubble sort the Strings in alphabetical
	 * order within ArrayList names.
	 * 
	 * @param names The passed ArrayList.
	 */
	public static void bubbleSortStrings(ArrayList <String> names)
	{
		//Declare a traverser int.
		int traverser = 0;
		
		//Declare a placeholder String.
		String placeholder;
		
		//Traverse the array.
		for(; traverser <= names.size() - 1; traverser++)
		{
			//Create a nested for loop to sort the array again.
			for(int traverser2 = 0; traverser2 < names.size() - 1; traverser2++)
			{	
				//Check to see if the current element is in alphabetical order.
				if(names.get(traverser2).compareTo(names.get(traverser2 + 1)) > 0)
				{
					//Swap the next element with the current element.
					placeholder = names.set(traverser2, names.get(traverser2 + 1));
					
					//Swap the current element and 'placeholder'.
					names.set(traverser2 + 1, placeholder);
				}
			}
		}
		
		//Print the ArrayList.
		System.out.println(names);
	}
}
