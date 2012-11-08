import java.util.Random;


public class Sorts {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int arrayLength = 15;
		int[] intArray = new int[arrayLength];
		for ( int i = 0; i < arrayLength; i++)
		{
			intArray[i] = rand.nextInt(100);
		}
		System.out.println("Prior to sort:");
		for (int i = 0; i < intArray.length ; i++)
		{
			if (i == intArray.length-1)
			{
			System.out.print(intArray[i]);
			}
			else 
			{
				System.out.print(intArray[i] + ", ");
			}
			
		}
		System.out.println();
		BubbleSort(intArray);
		System.out.println("After sort:");
		for (int i = 0; i < intArray.length ; i++)
		{
			if (i == intArray.length-1)
			{
			System.out.print(intArray[i]);
			}
			else 
			{
				System.out.print(intArray[i] + ", ");
			}
			
		}
	}
	
	public static void insertionSort(int array[], int n)
	{
		for (int i = 1; i < n; i++){
		int j = i;
		int B = array[i];
		while ((j > 0) && (array[j-1] > B)){
		array[j] = array[j-1];
		j--;
		}
		array[j] = B;
		}
	}
	
	
	public static void BubbleSort(int[] numberArray)
	{
		boolean go = true;
		int tempHold;
		 while (go)
	     {
	            go= false;    
	            for( int i=0;  i < numberArray.length-1;  i++ )
	            {
	                   if ( numberArray[i] > numberArray[i+1] )  
	                   {
	                	   tempHold = numberArray[i];                
	                	   numberArray[i] = numberArray[i+1];
	                	   numberArray[i+1] = tempHold;
	                          go = true;              //shows a swap occurred 
	                  }
	            }
	      } 
	}
	
	public static void selectionSort(int[] intArray) {
	    for (int i=0; i<intArray.length-1; i++) {
	        for (int j=i+1; j<intArray.length; j++) {
	            if (intArray[i] > intArray[j]) {
	                
	                int tempHold = intArray[i];//swapping
	                intArray[i] = intArray[j];
	                intArray[j] = tempHold;
	            }
	        }
	    }
	}
}
