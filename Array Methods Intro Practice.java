/**
 * This class is used to practice using arrays.
 * @author Jorrin Ikeno
 */
public class ArrayMethodsIntro
{

	public static void main(String[] args)
	{
		//Create an initial array.
		int[] arr = {2, 4, 6, 8, 10, 12};
		
		
		/* Task 1: Make a method that returns an array of
		 * the first and last elements of a passed array.
		 * 
		 * Example: {4, 7, 12, 3} returns {4, 3} */
		giveFirstAndLastArray(arr);
		
		/* Task 2: Make a method that changes an array.
		 * It should be passed the array and the index
		 * you want to change. It will divide specified index by 2.
		 * 
		 * Example: ({2, 4, 6, 8}, 2) returns {2, 4, 3, 8} */
		divideElementByTwo(arr, 3);
		
	}
	
	/**
	 * This method should return an array of the first
	 * and last elements of the passed array.
	 * 
	 * @param arr The passed array
	 * @return newArr, which is the array of the
	 * first and last elements of the passed array.
	 */
	public static int[] giveFirstAndLastArray(int[] arr)
	{
		/* Create an array that returns an array of the
		 * first and last elements of the passed array. */
		int[] newArr = {arr[0], arr[arr.length - 1]};
		
		/* Check to see if the method works.
		 * System.out.println("The length is " + newArr.length + ".");
		 * System.out.println("The first element is " + newArr[0] + " and the last element is " 
		 * + newArr[1] + "."); */
		
		//Return newArr.
		return newArr;
	}
	
	/**
	 * This method should divide the array's n'th element
	 * by 2.
	 * 
	 * @param arr The initial array.
	 * @param n The element that will be divided by 2.
	 * @return arr, which is the array with n'th element divided by 2.
	 */
	public static int[] divideElementByTwo(int[] arr, int n)
	{
		//Divide the n'th element by 2.
		arr[n] /= 2;
		
		/* Check to see if the array works.
		 * System.out.println(arr[n]); */
	}

}
