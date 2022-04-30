package OOP_Interface;

public class FortisHospital extends MedicalAssociation implements USMedical,UKMedical,IndiaMedical
{
    // US Medical
    @Override
    public void orthoServices()
    {
        System.out.println("FH - Ortho Services");
    }
    @Override
    public void physioServices()
    {
        System.out.println("FH - Physio Services");
    }
    @Override
    public void cardioServices()
    {
        System.out.println("FH - Cardio Services");
    }
    
    // UK Medical 
    @Override
    public void pediServices()
    {
        // TODO Auto-generated method stub
        System.out.println("FH - Pediatric Services");
    }
    @Override
    public void entServices()
    {
        // TODO Auto-generated method stub
        System.out.println("FH - ENT Services");
        
    }
    
    // Indian Medical
    @Override
    public void gynicServices()
    {
        System.out.println("FH - Gynic Services");
    }
    @Override
    public void neuroServices()
    {
        System.out.println("FH - Neuro Services");
        
    }
    @Override
    public void oncologyServices()
    {
        
        System.out.println("FH - Oncology Services");
    }
    
    // Local methods.
    public void pathologyServices()
    {
        System.out.println("FH Local - Ortho Pathology Services");
    }
    public void medicalInsurance()
    {
        System.out.println("FH Local - Medical Insurance Services");
    }
    
    // The common signature name method is @Override only once
    @Override
    public void emergencyServices()
    {
        System.out.println("FH-- Emergency Services");
        
    }
    @Override
    public void test(int i)
    {
        System.out.println("The passed value :" + i );
        
    }
    // its act as a local method or native method
  //   @Override -static methods cannot be override
    public static void hospitalAdmin()
    {
        System.out.println("FH - Hospital Administration");
    }
    
    // defaulf keyword is olny allowed in interface not in class.
    // to override this method the interface access specifier should be public
    @Override
    public void billing() 
    {
        System.out.println("FH --Billing");
    }
    @Override
    public void CovidTest()
    {
        System.out.println(" FH- Covid Test");
        
    }
}
