
/**
 * Teacher class is a Employee child subclass - he extendeds Employeeclass and add new features.
 *
 * @author (Ciljak)
 * @version (v 1.0 3.4.2021)
 */
import java.io.Serializable; // important API package for Serialization

public class Teacher extends Employee implements Serializable
{
   

    /**
     * Constructor for objects of class Teacher
     */
    private String approbation; //atributes specifich for child class

    public Teacher(String aprobation, String id, String firstname, String lastname, String employedSince, String employedTo, float salaryPerMonth, int workExperienceYears) {
        super(id, firstname, lastname, employedSince, employedTo, salaryPerMonth, workExperienceYears); // super keyword invoke parent constructor
        this.approbation = aprobation; //this keyword means actual lever parameter approbation
    }
    
    public final boolean basicTeacherInfo () { // final method can not be overrided at child class TeacherOfVocationalClasses
        System.out.println("------- Basic teacher INFO ------------------------");
        System.out.println("* " +super.getFirstname() + " " + super.getLastname());
        System.out.println("---------------------------------------------------");
        System.out.println("* With approbation: " + this.approbation );
        System.out.println("* Has working experience: " + super.getWorkExperienceYears());
        System.out.println("---------------------------------------------------");
        return true;
    }

    
}
