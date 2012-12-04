import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * Mapcar is a function that "will evaluate a function on every element of one or more lists and return a list of the result of each such evaluation".
 * In order to create an implementation of mapcar is java, it was necessary to import java.lang.reflect. This allowed my to pass a method as a parameter.
 * The mapcar method takes a method, an object, and one or more ArrayLists as parameters.Then it loops through the lists, and invokes the method on them.
 * It then adds the end result to a list that will be returned.
 * 
 * 
 * @author Alex Love, http://stackoverflow.com/a/4685609 this post was referenced for how to pass a method as a parameter.
 *
 */
public class Mapcar {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception 
	{
		Class[] parameterTypes1 = new Class[1];
		parameterTypes1[0] = String.class;
		
		Class[] parameterTypes = new Class[2];
		parameterTypes[0] = String.class;
		parameterTypes[1] = String.class;
        Method method1 = Mapcar.class.getMethod("concate", parameterTypes);//testing with 2 different lists
        Method method2 = Mapcar.class.getMethod("capitalize", parameterTypes1);//testing with 1 list
        
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		testList.add("d");
		
		ArrayList<String> testList2 = new ArrayList<String>();
		testList2.add("a");
		testList2.add("b");
		testList2.add("c");
		testList2.add("d");
		
		Mapcar mc = new Mapcar();
		ArrayList resultList = Mapcar.mapcar(method1, mc, testList, testList2);// calls mapcar on the 2 lists with the specified method 
		ArrayList resultList1 = Mapcar.mapcar(method2, mc, testList);
		for (int i = 0; i < resultList.size(); i++)
		{
			System.out.println(resultList.get(i));//print every element to test
		}
		
		for (int i = 0; i < resultList1.size(); i++)
		{
			System.out.println(resultList1.get(i));//print every element to test
		}
		
	}
	//basic method to test, capitalizes string
	public String capitalize(String x)
	{
		return x.toUpperCase();
	}
	//basic method to test, concatenates two strings together
	public String concate(String x, String y)
	{
		return x.concat(y);
	}
	
	/**
	 * 
	 * @param method the method you want to invoke
	 * @param object the object to invoke it on
	 * @param lists the different lists that will be used
	 * @return list the final list after the function is completed
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static ArrayList mapcar(Method method,Object object, ArrayList...lists) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException//"..."allows different number of lists
	{
		ArrayList list = new ArrayList();	//list to return	
		for ( int i = 0; i < lists[0].size(); i++)//goes through the amount of elements the first list has
		{
			Object[] parameters = new Object[lists.length];
			for (int y=0; y< lists.length; y++)
			{
				parameters[y]= lists[y].get(i);
			}
			
			list.add(method.invoke(object, parameters));//add final results to the list, evaluating each element of each list
		}
		return list;
	}
	
	
	
}

