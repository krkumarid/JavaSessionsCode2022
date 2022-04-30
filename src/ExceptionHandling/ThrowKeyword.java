package ExceptionHandling;

public class ThrowKeyword
{

    public static void main(String[] args)
    {
       try {
           throw new Exception("EXEL cell data is blank exception");
           
       }
       catch( Exception e )
       {
          // System.out.println(e.toString());
           e.printStackTrace();
       }

    }

}
