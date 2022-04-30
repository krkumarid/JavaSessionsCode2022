package JavaSessions;

public class LoopAssignment
{
    
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
       /* String str = "I am Batman";
        
        for( int i = 0; i <5;i++)
        {
            System.out.println(str);
        }
        
        System.out.println("**********************************");
        for( int j = 1; j <10;j++)
        {
            System.out.println(str +j);
        }
        
        System.out.println("**********************************");
        int k = 10;
        
        while( k >0 )
        {
            System.out.println( k );
            k--;
        }
        System.out.println("**********************************");
        int l = 10;
        do
        {
            System.out.println( l );
            l--;
        }while( l >0 ); */
       // Question 5
        int n = 1;
        while( n <=10 )
        {
            if( (n % 7) != 0)
                
            {
                System.out.println( n );
            }
            else
            {
                break;
            }
             n++;
        }
    }

}
