package ConstructorConcept;

public class Employee
{
    
    String name;
    int id;
    int age;
    boolean isPerm;
    char gender;
    // Constructor 
    // the name of the constructor should be same as class name.
    // constructor  cannot have a return type.
    // constructor will be called when you create the object
    
    /** The difference between constructor and a function */
    // Function may or may not have a return type.. but the constructor will never return any value.
    // function name can be anything..but the constructor name should be same as the class name.
    // function will have the business logic/feature logic but constructor does not have a business logic .
    //  constructor helping to create object.
    
    // to call the function we need a object and object reference variable.
    
     
    public Employee()
    {
        System.out.println("Default constructor");
    }
    
    public Employee(int id)
    {
        System.out.println(id);
    }
    public Employee( String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    public Employee( String name,int id,int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public Employee( String name ,boolean isPerm)
    {
        this.name = name;
        this.isPerm = isPerm;
    }

    public Employee(String name, int id, int age, boolean isPerm, char gender)
    {
       // super();
        this.name = name;
        this.id = id;
        this.age = age;
        this.isPerm = isPerm;
        this.gender = gender;
    }
}

