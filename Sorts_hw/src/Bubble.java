import java.util.Random;

public class Bubble {
	
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
}
