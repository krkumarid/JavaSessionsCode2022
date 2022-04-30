package WebDriverArch;

public class GoogleAppTesting
{
    // reference variable of webdriver interface
    static WebDriver driver; // class level variable.
    
    public static void main(String[] args)
    {
       
//        /* ChromeDriver driver = new ChromeDriver();*/
//        //  FirefoxDriver driver  =  new FirefoxDriver();
//        SafariDriver driver = new SafariDriver();
        // driver.x= 20; its final cannot change the value
        String browser = "safari";
        if( browser.equals("chrome"))
        {
            // Top casting
            driver = new ChromeDriver();
        }
        else if( browser.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if( browser.equals("safari"))
        {
            driver = new SafariDriver();
        }
        else
        {
            System.out.println(" Provide a valid  browser name");
        }
         driver.get("www.goole.com");
         driver.getTitle();
         driver.getPageUrl();
         driver.findElement("username");
         driver.quit();
    }

}
