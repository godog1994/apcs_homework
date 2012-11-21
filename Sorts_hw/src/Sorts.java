import java.util.Random;

/**
 * 
 * @author Alex Love
 * 	This class contains three different sort methods. Bubble sort, selection sort, and insertion sort. 
 *  Each of these methods takes in an array of integers and sorts them from lowest to highest.
 *  In bubble sort if an element is greater than the next element, they are swapped.
 *  In selection sort, the smallest element is found and then placed first. This repeats through all the elements until it is sorted.
 *  In insertion sort, an element is compared to other elements until all previous elements are less than the current element.
 *
 */
public class Sorts {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int arrayLength = 5;
		int[] intArrayBubble = new int[arrayLength];
		int[] intArraySelection = new int[arrayLength];
		int[] intArrayInsertion = new int[arrayLength];
		for ( int i = 0; i < arrayLength; i++)
		{
			intArrayBubble[i] = rand.nextInt(100);
			intArraySelection[i] = rand.nextInt(100);
			intArrayInsertion[i] = rand.nextInt(100);
		}
		System.out.println("Before bubble sort:");
		for (int i = 0; i < arrayLength ; i++)
		{
			System.out.print(intArrayBubble[i] + " ");
		
			
			
		}
		System.out.println();
		System.out.println("Before selection sort:");
		for (int i = 0; i < arrayLength ; i++)
		{
			System.out.print(intArraySelection[i] + " ");	
		}
		System.out.println();
		System.out.println("Before insertion sort:");
		for (int i = 0; i < arrayLength ; i++)
		{
			System.out.print(intArrayInsertion[i] + " ");	
		}
		System.out.println();
		bubbleSort(intArrayBubble);
		selectionSort(intArraySelection);
		insertionSort(intArrayInsertion);
		System.out.println("After bubble sort:");
		for (int i = 0; i < intArrayBubble.length ; i++)
		{
			System.out.print(intArrayBubble[i] + " ");
			
		}
		System.out.println();
		System.out.println("After selection sort:");
		for (int i = 0; i < intArrayBubble.length ; i++)
		{
			System.out.print(intArraySelection[i] + " ");
			
		}
		System.out.println();
		System.out.println("After insertion sort:");
		for (int i = 0; i < intArrayBubble.length ; i++)
		{
			System.out.print(intArrayInsertion[i] + " ");
			
		}
	}
	/**
	 * Takes an array of integers and sorts using an insertion sort
	 * @param array The array to be sorted
	 */
	public static void insertionSort(int[] array)
	{
		for (int i = 1; i < array.length; i++)
		{
		int a = i;
		int b = array[i];
		while ((a > 0) && (array[a-1] > b))
		{
		array[a] = array[a-1];
		a--;
		}
		array[a] = b;
		}
	}
	
	/**
	 * Takes an array of integers and sorts using a bubble sort
	 * @param numberArray the array to be sorted
	 */
	public static void bubbleSort(int[] numberArray)
	{
		boolean go = true;
		int tempHold;
		 while (go)
	     {
	            go= false;    
	            for( int i=0;  i < numberArray.length-1;  i++ )
	            {
	                   if ( numberArray[i] > numberArray[i+1] )  //if current element is greater than next element   
	                   {
	                	   tempHold = numberArray[i];                
	                	   numberArray[i] = numberArray[i+1];
	                	   numberArray[i+1] = tempHold;
	                          go = true;//go through while loop again if current element is greater than next element             
	                  }
	            }
	      } 
	}
	/**
	 * Takes an array of integers and sorts them using a selection sort
	 * @param intArray the array to be sorted
	 */
	public static void selectionSort(int[] intArray) 
	{
	    for (int i=0; i<intArray.length-1; i++) 
	    {
	        for (int j=i+1; j<intArray.length; j++) 
	        {
	            if (intArray[i] > intArray[j]) 
	            {
	                
	                int tempHold = intArray[i];
	                intArray[i] = intArray[j];
	                intArray[j] = tempHold;
	            }
	        }
	    }
	}
}
