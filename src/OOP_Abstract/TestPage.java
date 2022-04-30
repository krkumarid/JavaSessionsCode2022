package OOP_Abstract;



public class TestPage
{

    public static void main(String[] args)
    {
        
        LoginPage refLP = new LoginPage();
        
        refLP.header();
        refLP.titile();
        refLP.url();
        
        // accessing the static methods in abstract class
        
        Page.logo();
        
        /// accessing the own methods in Login page
        refLP.x = 12;
        refLP.doLogin("Kasi", refLP.x );
        refLP.doLogin("sreesha", "Karthi");
        
        // cannot create the object of Abstract class
       // Page pg = new Page();
        
        
    }

}
