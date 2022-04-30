
/*
 * Print 1 to 100 without using numbers 
 */
package JavaSessions;

public class PrintWithoutnumbers
{

    public static void main(String[] args)
    {
        int i = 'A'/'A';
        String str ="**********";  // A string with length 10;
        for( int count =i; count <=(str.length()* str.length()); count++ )
        {
            System.out.println( count );
        }
         System.out.println("------------------------");
        // using ascii value
        for ( int x = i;x <='d';x+=i )
        {
            System.out.println( x );
        }
    }

}
