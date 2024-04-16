/**
 * ArrayList methods are a little unique.
 * They usually do something and return something, for extra functionalities.
 * The point of this assignment is to practice the unique methods.
 * 
 * After each task (except task 1) print out the length of the foods ArrayList.
 * 
 * @author Jorrin Ikeno
 */
import java.util.ArrayList;

public class ArrayListMethodsInDepth
{

	public static void main(String[] args)
	{
		//Instantiate an empty ArrayList foods that stores Strings.
		ArrayList<String> foods = new ArrayList<String>();
		
		//Add the following Strings to foods: "Apples", "Bread", "Cookies".
		foods.add("Apples");
		foods.add("Bread");
		foods.add("Cookies");
		
		
		//Task 1: Print out the length of the foods ArrayList.
			/*
			 * In general, the method should simply print the
			 * length of the given array return said length.
			 * 
			 * In this case, the method should return "3".
			 */
		
		System.out.println(foods.size());
		System.out.println("");
		
		
		/*
		 * Task 2: Inside of a print statement, add the String
		 * "Dole Whip" to foods. In the line comment for this code,
		 * state what it prints.
		 */
			/*
			 * In general, the method should add a new element to
			 * the ArrayList and return true.
			 * 
			 * This case is no exception, so the method should return true.
			 */
		
		//This should print "true".
		System.out.println(foods.add("Dole Whip"));
		
		//Print out the length of the foods ArrayList.
		System.out.println(foods.size());
		System.out.println("");
		
		
		/*
		 * Task 3: Inside of a print statement, use the .set(E) method
		 * to change "Bread" in foods to "Butter". Comment what it prints. 
		 */
			/*
			 * In general, the method should change the value of a selected
			 * element in the ArrayList with a new inputed value and return
			 * the element that was replaced.
			 * 
			 * In this case, the method should return "Bread".
			 */
		
		//This should print "Bread".
		System.out.println(foods.set(1, "Butter"));
		
		//Print out the length of the foods ArrayList.
		System.out.println(foods.size());
		System.out.println("");
		
		
		/*
		 * Task 4: Inside of a print statement, use the .remove(int) method
		 * to remove "Cookies" from foods. Comment what it prints.
		 */
			/*
			 * In general, the method should remove a selected element in the
			 * ArrayList and return its value.
		 	 * 
		 	 * In this case, the method should return "Cookies".
		 	 */
		
		//This should print "Cookies".
		System.out.println(foods.remove(2));
		
		//Print out the length of the foods ArrayList.
		System.out.println(foods.size());
		System.out.println("");
		
		
		/*
		 * Task 5: For each task, go back and comment what the method you
		 * are calling does, and what the method returns (both in general
		 * and in this case).
		 */
	}

}
