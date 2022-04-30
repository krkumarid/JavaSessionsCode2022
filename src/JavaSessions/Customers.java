package JavaSessions;

public class Customers {

	
	String name;
	int id;
	static String city = "Banglore";
	static String paymentMethod = "CC";
	
	public void getInfo()
	{
		System.out.println("get info");
	}
	
	public static void sendMail()
	{
		System.out.println("send mail");
	}
	public static void main(String[] args) {
		
		Customers obj = new Customers();
		
		// How to call the static methods
		
		//1.call directly
		sendMail();
		
		//2. using the class name.
		Customers.sendMail();
		
		// 3 using the object reference
		obj.sendMail();// it will always gives a warning.
		// interview Question
	}

}
