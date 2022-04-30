package OOP_Encapsulation;

public class Company 
{
    public String name;
    private int sharePrice;
    public String hq;
    //getter * read property
    public int getSharePrice()
    {
        return sharePrice;
    }
    //setter * Write property
    public void setSharePrice( int sh)
    {
        this.sharePrice = sh;
    }
//    public static void main( String[] args )
//    {
//        Company obj = new Company();
//        obj.sharePrice = 0;
//        obj.name = "CTS";
//        obj.hq = "Texas";
//        System.out.println("main");
//    }
}
