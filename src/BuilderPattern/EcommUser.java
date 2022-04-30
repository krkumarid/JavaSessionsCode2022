package BuilderPattern;

public class EcommUser
{

    public static void main(String[] args)
    {
        EcommApp shop = new EcommApp();
        // method chaining
        shop
        .login("krkumarid@gmail.com", "xyz")
        .doSearch("Dell", 3000)
        .addToCart("Dell")
        .doPayment("DFA", "xyz")
        .getEmail()
        .logout()
        .login()
        .doSearch("MacBook")
        .addToCart("MacBook")
        .doPayment("APPLE", "apple123")
        .logout();
        
        // if the function is returning any value other than the current object then method chaining is not possible.k
        int order = shop.generateOrderId();
        System.out.println(order );
        
        shop.login().doPayment("BOFA", "123").logout();
        
        shop.doSearch("Ipad").addToCart("iPad").doPayment("apple", "Apple123").logout();
        
    }

}
