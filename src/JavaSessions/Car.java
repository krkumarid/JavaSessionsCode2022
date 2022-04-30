package JavaSessions;

public class Car {

	
	String name;
	int price;
	String color;
	static int wheels = 4;
	
	
	
	public static void main(String[] args) {
		
		int i = 10;
		
	Car c1 = new Car();
	
	c1.name ="BMW";
	c1.price=60;
	c1.color = "blue";
	// c1.wheels = 4;
	// static class variable should be common value.
	// 
	Car c2 = new Car();
	
	c2.name ="AUDI";
	c2.price=70;
	c2.color = "White";
	// c2.wheels = 4;
	
	Car c3 = new Car();
	
	c3.name ="HONDA";
	c3.price=15;
	c3.color = "Black";
	// c3.wheels = 4;
	
	// How to access static variables.
	//1.within the same class access it directly
	//  no need to create the object
	System.out.println(wheels);// it's not a good practice
	
	// 2. you can call with the class name.
	
	System.out.println(Car.wheels);
	
	// 3. you can call by object also
	System.out.println(c1.wheels);// print with warning .Its not part of object.its a common property.
	
	
	}

}
