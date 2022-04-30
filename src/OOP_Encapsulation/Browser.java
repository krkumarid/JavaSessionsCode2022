package OOP_Encapsulation;

public class Browser
{
    public void launchBrowser()
    {
        System.out.println("launch browser");
        checkVersion();
        checkOSVersion();
        checkRAM();
        System.out.println("Browser is launched");
    }
    public void getBrVerion()
    {
       checkVersion(); 
    }
    //Encapsulating the methods.
    private void checkVersion()
    {
        System.out.println("Check br version");
    }
    private void checkOSVersion()
    {
        System.out.println("Check OS version");
    }
    private void checkRAM()
    {
        System.out.println("Checkig RAM");
    }
    // end of encapsulating the methods.
}
