package JavaSessions;

public class TestBlock {
	
	static {
		System.out.println("*****Static block executed*****");
	}
	public static void test()
	{
		System.out.println("The test method executed");
	}
	public static void main(String[] args)
	{
		System.out.println("The main mehtod");
		test();
	}
}