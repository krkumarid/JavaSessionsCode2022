package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		/*int x[] = new int[10];
	
		System.out.println(x);
		
		*The static array will print the garbage value of x
		*
		*/
		
		ArrayList<Integer> number  = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		System.out.println(number);
		
		/* If we want to print the contents of static array witout for loop
		 * use Arrays.toString(arrayname);
		 */
		
		int i[] = { 10,20,30,40,50,60};
		System.out.println(Arrays.toString(i));
		System.out.println("*****************************************");
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Rajee","Sreesha","Karthi"));
		System.out.println(names);
		
		ArrayList<String> l1 = new ArrayList<String>( Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		System.out.println(l1.equals(l3));
		
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		// Differnce of lists
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
//		l4.removeAll(l5);
//		System.out.println(l4); print [F]
//		//System.out.println(l5);
		l5.removeAll(l4);// will print [E]
		System.out.println(l5);
		
		// Find the common elements in the ArrayList
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java","Python","Js","DS","Algo"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java","Python","JS","DS","PHP"));
		
		lang1.retainAll(lang2); // Retain all is case sensitive.
		System.out.println(lang1);
		// System.out.println(lang2);
		
		// Combining two ArrayLists
		
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("p","q","r"));
		
//		l6.addAll(l7);
//		System.out.println(l6);
//		System.out.println(l7);
		
		l7.addAll(l6);
		System.out.println(l6);
		System.out.println(l7);
		
		// To clear all the elements
		//l7.clear();
		System.out.println(l7);
		
		// Remove the elemnts from another list
		l7.removeAll(l6);
		System.out.println(l7);
		
		// Copy the array list to another list
		
		ArrayList<String> cloneList = (ArrayList<String>)l7.clone();
		System.out.println(cloneList);
		
		
	}

}
