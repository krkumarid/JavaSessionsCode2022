package OOP_Encapsulation;

public class Employee 
{
    public static void main(String[]  args)
    {
        Company  c1 = new Company();
        c1.name ="Microsoft";
        c1.hq = "California";
        c1.setSharePrice(1290);
        // its not possible to access sharePrice bcz its private.
        int x = c1.getSharePrice();
        System.out.println(x);
    }
}
