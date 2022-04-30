
package BuilderPattern;

public class EcommApp
{
    // The builder class methods will return the current class object
    // the return type is a class
    
    public EcommApp login()
    {
        System.out.println("default login");
        return this; 
        
    }
    public EcommApp login( String un , String pw )
    {
        System.out.println(" Login with :" + un + ":" + pw );
        return this;
    }
    public EcommApp doSearch( String productName)
    {
        System.out.println("Search with :" + productName );
        return this;
    }
    public EcommApp doSearch( String productName, int price )
    {
        System.out.println(" search witj :" + productName + "Price: " + price );
        return this;
    }
    public EcommApp selectProduct( String productName )
    {
        System.out.println(" Select the product :" + productName );
        return this;
    }
    
    public EcommApp addToCart( String prodName )
    {
        System.out.println(" Product added to the cart : " + prodName );
        return this;
    }
    
    public EcommApp doPayment( String account, String pwd )
    {
        System.out.println(" Payment done via" + account + ":" +   pwd );
        return this;
    }
    public int generateOrderId()
    {
        return 10010;
        
    }
    public EcommApp getEmail()
    {
        System.out.println("Email snet successfully");
        return this;
    }
    
    public EcommApp logout()
    {
        System.out.println("Logout successfully");
        return this;
    }
}
