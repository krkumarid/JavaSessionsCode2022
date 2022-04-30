package OOP_Abstract;

public  abstract class Page
{
    /*
     * we cannot create the object of abstract class and interface
     */
    // abstract class can have the constructor
    // the constructor is called when the we are creating the object of the child class
    
    public Page()
    {
        System.out.println(" Page - constructor");
    }
    
    // abstract methods
    public abstract void titile();
    public abstract void url();
    public abstract void loading();
    // abstract class can have non abstract methods too
    
    public void header()
    {
        System.out.println(" Page -- header ");
    }
    
    
    // abstract class can have static methods too
    // static methods cannot be overriden
    // in order to prevent the inheritance make the static methods as final
    
    public static final void logo()
    {
        System.out.println("Page -- Logo");
    }

    int x= 10;
}