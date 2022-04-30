package OOP_Abstract;

public abstract class Application
{
    // all the methods are abstract in nature
    
    // no non abstract methods
    
    // 100 % abstraction
    
    public abstract void serverSetup();
    public abstract void dbSetup();
    public abstract void envSetup();
    
    public void uiLayer()
    {
        System.out.println(" AP -- Application UI ");
    }
}
