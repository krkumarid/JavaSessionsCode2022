package JavaSessions;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("B Main");
		
		A.main(args);
		// it will produce java.lang.StackOverflowError
		
		// The function is calling from diffrent class.
		//So each call will add to stack.Once the stack memory is over it will generate
		//stackoverflow error
	}

}
