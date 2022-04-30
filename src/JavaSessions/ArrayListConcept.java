package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		//System.out.println(ar.get(7));// IndexOutOfBoundsException
		//System.out.println(ar.get(-1));// IndexOutOfBoundsException
		// Print all the elements of ArrayList
		
		for( int i = 0;i< ar.size();i++)
		{
			System.out.println(ar.get(i));
		}

		// Adding different data type value
		
		ar.add(12.33); // double
		ar.add("Java");// string
		ar.add('c');// character
		ar.add(true);// boolaen
		ar.add(500);// adding alredy existing value.
		
		
	}

}
