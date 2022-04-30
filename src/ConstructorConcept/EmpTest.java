package ConstructorConcept;

public class EmpTest
{

    public static void main(String[] args)
    {
        
        Employee e1 = new Employee();
        
        Employee e2 = new Employee(10);
        
        Employee e3 = new Employee("Rajeev",1186);
        
        System.out.println(e3.name+ " " + e3.id+"" + e3.age +" " +e3.gender + " " + e3.isPerm );

    }

}
