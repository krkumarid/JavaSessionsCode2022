package JavaSessions;

public class FinallyConcept
{

    public static void main(String[] args)
    {
//        int p = 10;
//        try
//        {
//            int div = p / 0;
//            
//        }
//        catch (NullPointerException e) {
//            System.out.println("AE is coming");
//           //  e.printStackTrace();
//        }
//    
//        finally {
//            System.out.println("inside the fianlly block");
//        }
//        System.out.println(" Bye....."); // This time this line will not execute bcoz the exception not  handled proprly.
        System.out.println( getMarks("tom"));
        
        
    }
    
    public static int getMarks( String name )
    {
            if( name.equals("tom"))
            {
                try
                {
                    int i = 9/0;
                    return 67;
                }
                catch( ArithmeticException e )
                {
                    System.out.println(" Exception ....");
                    return 78;
                }
                finally
                {
                    System.out.println("Bye....");
                    return 85;
                }
            }
            else if( name.equals("Kasi"))
            {
                return 90;
            }
            else 
            {
                System.out.println("Name not found!!");
                return -1;
            }
            
            
          
        
    }
}
