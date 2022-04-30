package JavaSessions;
/*
 *  Print 1-100 without using a loop
 */
public class PrintWithoutLoop
{

    public static void main(String[] args)
    {
       CountNumber(1 );

    }
    public static void CountNumber( int number )
    {
        if( number<=100)
        {
            System.out.println( number );
            number++;
            CountNumber(number);
        }
    }
}
