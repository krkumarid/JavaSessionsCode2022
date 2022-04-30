package OOP_Abstract;

public class ApplicationTesting
{

    public static void main(String[] args)
    {
        
        WhatsApp refWt = new WhatsApp();
        
        refWt.dbSetup();
        refWt.serverSetup();
        refWt.envSetup();
        // non abstract method
        refWt.uiLayer();
        
        

    }

}
