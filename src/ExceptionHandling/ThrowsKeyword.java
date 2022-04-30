package ExceptionHandling;

public class ThrowsKeyword
{
    public void m1() throws ArithmeticException
    {
        System.out.println("m1");
        m2();
    }
    
    public void m2() throws  ArithmeticException
    {
        System.out.println("m2");
        m3();
    }
    public void m3() throws ArithmeticException
    {
        System.out.println("m3");
        m4();
    }
    public void m4()
    {
        System.out.println("m4");
        try {
            booking();
        }
        catch (ArithmeticException e) {
            // TODO: handle exception
        }
    }

    public void booking() throws ArithmeticException
    {
        System.out.println("Inside booking method");
        int i = 9/0;
        
    }
    public static void main(String[] args)  //throws ArithmeticException never write throws for main method
    {
        ThrowsKeyword obj = new ThrowsKeyword();
        obj.m1();

    }

}
