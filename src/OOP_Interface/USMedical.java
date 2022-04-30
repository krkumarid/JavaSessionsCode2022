package OOP_Interface;

public interface USMedical extends WHO,UNICEF
{
    // Interface cannot have method body.
    // Only method prototype
    // Only method declaration
    // cannot create the object of interface.
    // all the variables in the inteface are static and final by deafault.
    
//    public void test() // its wrong
//    {
//        
//    }
    
    
     int minimalFee = 25; // always static and final
     
    public void orthoServices();
    
    public void physioServices();
    
    public void cardioServices();
    
    public void emergencyServices();
    
    public void test( int i);// method with parameter
    
    // After JDK 1.8
    //1. We can have static methods in the interface with method body
    
    public static void hospitalAdmin()
    {
        System.out.println("US - Hospital Administration");
    }
    
    //2. default method
    // Its not static in nature
    // To override this method in child class it's access specifier should be public
    //  default keywords is only allowed in interfaces.
    
    public default void billing()
    {
        System.out.println("US --Billing");
    }
    
}
