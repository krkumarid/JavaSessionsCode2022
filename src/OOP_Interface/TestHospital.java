package OOP_Interface;

public class TestHospital
{

    public static void main(String[] args)
    {
       
        FortisHospital refFH = new FortisHospital();
        
        refFH.cardioServices();
        refFH.emergencyServices();
        refFH.entServices();
        
        refFH.medicalInsurance();

        
        refFH.gynicServices();
        
        //  Top casting from Interface ( Up casting)
        
        USMedical usIn = new FortisHospital();
        
        
        usIn.emergencyServices(); // Common methods across all the interface.
        usIn.cardioServices();
        usIn.orthoServices();
        usIn.physioServices(); 
        
        System.out.println( USMedical.minimalFee );
        
        // USMedical.minimalFee = 60; //Interface values are final so we could not change the value.
        
       // usIn.gynicServices(); // Its not possible because its not reffering to IndiaMedical interface.typeCastException
        
        
        // down casting is not allowed
       //  FortisHospital rfFh =( FortisHospital ) new  USMedical();// Even compile time also its not allowed.
        
        refFH.test(100);
        
        FortisHospital.hospitalAdmin(); 
        
        USMedical.hospitalAdmin(); // Static method in the interface.It cannot be overriden
        
        refFH.billing();
        System.out.println("##############Extending one class and implementing 3 interfaces #########################");
        refFH.MedicalStandards();
        System.out.println("** Method from WHO interfcae****");
        refFH.CovidTest(); 
        System.out.println("*** Acccessing the methods from Super class Medical Association Class");
        refFH.MedOrg(); 
    }

}
