import java.util.Random;


public class Selection {
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
	public static void main(String[] args)
	{
		Random rand = new Random();
		int arrayLength = 10;
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
		selectionSort(intArray);
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
}
