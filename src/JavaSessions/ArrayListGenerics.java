package JavaSessions;

import java.util.ArrayList;



public class ArrayListGenerics {

	public static void main(String[] args) {
		
		// Classes are always non -premitive datatype.
		// Only non premitive datatypes have methods
		
		//  Integer Array List
		ArrayList<Integer> arInt = new ArrayList<Integer>();
		arInt.add( 100);
		arInt.add(200);
		//arInt.add(12.33);// It's is not allowed because this array list is only for Integer
		
		
		for( Integer e : arInt)
		{
			System.out.println(e);
		}
		System.out.println("*******************************");
		// We can use int as datatype
		for( int i :arInt)
		{
			System.out.println(i);
		}
		// double Array List
		
		ArrayList<Double> arDouble = new ArrayList<Double>();
		arDouble.add(12.22);
		arDouble.add(15.33);
		
		
		System.out.println("*******************************");
		// String Array List
		
		ArrayList<String> arString = new ArrayList<String>();
		
		arString.add("Rajeev");
		arString.add("Sreesha");
		arString.add("Kasi");
		arString.add("Karthi");
		for(String str: arString)
		{
			System.out.println(str);
		}
		
		System.out.println("*******************************");
		System.out.println(arString.get(3));
		
		System.out.println("*******************************");
// Object type data type
		
		ArrayList<Object> arObj = new ArrayList<Object>();
		
		arObj.add("Rajeevkumar");
		arObj.add(25);
		arObj.add('m');
		arObj.add(42.55);
		arObj.add(true);
		System.out.println(arObj.size());
		for( Object ob : arObj)
		{
			System.out.println(ob);
		}
	}

}
