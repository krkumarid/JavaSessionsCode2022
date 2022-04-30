package JavaSessions;

public class ObjectReferenceConcept {

	// Class data members
	
	// Clas variables
	
	String name;
	int age;
	
	public void get()
	{
		System.out.println("Get method");
	}
	
	public static void main(String[] args) {
		
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		
//		// System.out.println(obj.age);
//		obj = null;
//		 obj.name = "Rajeev";//NPE -> null pointer exception
//		 obj.age = 42;
//		 
//		// System.out.println(obj.name);
		
		new ObjectReferenceConcept().name ="kASI";
		new ObjectReferenceConcept().age= 11;
		new ObjectReferenceConcept().get();
		System.gc();
		
	
	}

}
