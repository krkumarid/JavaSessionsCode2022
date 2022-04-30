package JavaInterviewQuestions;

public class OneSidePattern
{

    public static void main(String[] args)
    {
        /*
         * *
         **/
        int nCount = 10;

        for (int i = 1; i <= nCount; i++)
        {
            // printing the space first
            for (int j = (nCount - 1); j >= i; j--)
            {
                System.out.print("\s");
            }
            for (int k = 1; k < i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
