package WebDriverArch;

public class FirefoxDriver implements WebDriver
{

    public FirefoxDriver()
    {
        System.out.println("launch Google Firefox  Driver");
    }
    
    @Override
    public void get(String url)
    {
        // TODO Auto-generated method stub
        System.out.println(" Chrome driver -URL " + "" + url);
        
    }

    @Override
    public void getTitle()
    {
        // TODO Auto-generated method stub
        System.out.println(" Chrome driver -gettitle");
        
    }

    @Override
    public void getPageUrl()
    {
        // TODO Auto-generated method stub
        System.out.println(" Chrome driver -get Page title");
    }

    @Override
    public void findElement(String locator)
    {
        // TODO Auto-generated method stub
        System.out.println(" Chrome driver -loactor  "+ " " + locator );
        
    }

    @Override
    public void quit()
    {
        // TODO Auto-generated method stub
        System.out.println(" Chrome driver -quit");
        
    }
}
