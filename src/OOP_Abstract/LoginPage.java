package OOP_Abstract;

public class LoginPage extends Page
{
    
    public LoginPage()
    {
        System.out.println(" Lp -- constructor");
    }

    @Override
    public void titile()
    {
        System.out.println("LP - title");
        
    }

    @Override
    public void url()
    {
        System.out.println(" LP-- url -- https//www.xyz.com");
    }

    @Override
    public void loading()
    {
        System.out.println("LP-- loading");
    }
    
    // we cannot create a abstract method inside a non abstract class
    
    // public abstract void lpPage();

    // own methods
    
    public void doLogin( String un, String pw )
    {
        System.out.println(" LP -- Login using username and password " + un + " " + pw );
    }
    
// I can overload the methods too 
    public void doLogin( String str, int n )
    {
        System.out.println(" LP -- doLogin overloading method"+ str +" " + n);
    }
}
