/*
 *  Print Hello world using the static block
 *  Static block will load at the time of class load
 */
package JavaSessions;

public class HelloWorldUsingStaticBlock
{
    
    // static block will execute first
    static
    {
        System.out.println("I am insde static block");
        System.out.println("Hello world Using Static block");
    }
    public static void main(String[] args)
    {
       System.out.println(" I am   inside main ");
    }

}
