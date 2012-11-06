import java.util.Random;

public class Bubble {
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		int arrayLength = 10;
		int[] intArray = new int[arrayLength];
		for ( int i = 0; i < arrayLength; i++)
		{
			intArray[i] = rand.nextInt(100);
		}
		BubbleSort(intArray);
		for (int i = 0; i < intArray.length ; i++)
		{
			System.out.println(intArray[i]);
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
