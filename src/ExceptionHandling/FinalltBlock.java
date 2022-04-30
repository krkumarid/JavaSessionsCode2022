package ExceptionHandling;

public class FinalltBlock
{

    public static void main(String[] args)
    {
        System.out.println("A");
        
        try {
            int i = 9/3;
            
        }
        catch(Exception e)
        {
            System.out.println("Exception is here");
        }
        finally
        {
            System.out.println("Bye...");
        }
    }

}
