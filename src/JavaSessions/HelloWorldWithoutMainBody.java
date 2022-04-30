package JavaSessions;

public class HelloWorldWithoutMainBody
{

    /*
     * public static int printHello() {
     * System.out.println(" I am inside the PrintHello()");
     * System.out.println(" Hello world !!"); return 1; }
     */
    public static String printHello()
    {
        System.out.println(" I am inside the PrintHello()");
        System.out.println(" Hello world !!");
        return "s";
    }
    static String p = printHello();
    
    public static void main(String[] args)
    {
       
       
    }

}
