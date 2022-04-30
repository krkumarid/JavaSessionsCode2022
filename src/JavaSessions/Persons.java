package JavaSessions;

public class Persons {

	
	 public void m1()
	 {
		 System.out.println("m1");
		 m2();
	 }
	 public void m2()
	 {
		 System.out.println("m2");
		 m3();
	 }
	 public void m3() 
	 {
		 System.out.println("m3");
		/*
		 *  non static member  can call static method
		 *   because all objects have access to the common
		 *    memory area.
		 */ 
		 p2();
	 }
	 public static void p1()
	 {
		 System.out.println(" inside static method p1");
		 //m1(); calling s non static member.
		 Persons.p2();
	 }
	 public static void p2()
	 {
		 System.out.println(" inside static method p2");
		 Persons.p3();
	 }
	 public static void p3()
	 {
		 System.out.println(" inside static method p3");
	 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Persons p1 = new Persons();
		// p1.m1();
		 /* One function is calling from another function
		  * this is called method chaining.
		  */
		// Persons.p1();
		p1();// this is also possible because these three methods 
		// residing in the same common memory area.
	}

}
