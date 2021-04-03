
/**
 * Teacher class is a Employee child subclass - he extendeds Employeeclass and add new features.
 *
 * @author (Ciljak)
 * @version (v 1.0 3.4.2021)
 */
public class Teacher extends Employee
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Teacher
     */
    private String approbation; //atributes specifich for child class

    public Teacher(String aprobation, String id, String firstname, String lastname, String employedSince, String employedTo, float salaryPerMonth, int workExperienceYears) {
        super(id, firstname, lastname, employedSince, employedTo, salaryPerMonth, workExperienceYears); // super keyword invoke parent constructor
        this.approbation = aprobation; //this keyword means actual lever parameter approbation
    }
    
}
