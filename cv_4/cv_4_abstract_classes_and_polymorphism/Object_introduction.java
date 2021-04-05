

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class is meant to be a tester class, contains main Java method and instantionate objects
 * from prewious classes with goal to demonstrate real work with them.
 *
 * @author  (Ciljak)
 * @version (v 1.0 3.4.2021)
 */
public class Object_introduction
{
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // entry class in java
        // TODO code application logic here
        final String SAVE_LOCATION = "our_school.txt";
        
        School our_school = new School("Example vocational school","Vocational school", 16 ); // we instantionate and construct our object along class teplate School
        
        // now we show values asgnet to the object properties by constructor
        System.out.println("Name of our example school is: " + our_school.getName());
        System.out.println("Type of our school is: " + our_school.getType() + " and number of classes is " + our_school.getNrOfClasses());
        
        // create new teacher
        Teacher our_example_teacher;
        our_example_teacher = new Teacher("MAT BIO", "SKU01", "John", "DOE", "1.9.2020", "31.8.2021",975.0f , 4);
        // create new class for our example school and assign them into our school
        School_class I_A = new School_class("I.A", "I.A - TLY 3918M", 24, our_example_teacher);
        School_class I_B = new School_class("I.B", "I.B - MEC 2387M", 20, our_example_teacher); // for now we created two school class
        
           // adding classes into a school
        our_school.addClassIntoSchool(I_A);
        our_school.addClassIntoSchool(I_B);
        
       
        // show all our school classes
        our_school.showAllSchoolClasses(); // we inwoking method implemented in School_class responsible for showing info about currently added classes into our school
        
         // saving our school with serializable feature
        ImplementationSupportFunction supportFunction = new ImplementationSupportFunction(); // instantionate object providing SupportFunction
        
        
        if (supportFunction.saveObject(SAVE_LOCATION, our_school)) { //
            System.out.println("School object succcesfully saved to loaction:" + SAVE_LOCATION);
        } else {
            System.out.println("There were errors during saving process!");
        } 
        
      
        
        School restored_school ;
        
        restored_school = (School)supportFunction.readObject(SAVE_LOCATION);
        System.out.println("Our restored school from file contains these data:");
        
        try {
           restored_school.showAllSchoolClasses(); // show content of restored school
        }
    catch(NullPointerException e) {
       System.out.println("NullPointerException thrown!");
    }
    
        //example of use static methon - number of instantionated school_class objects
        System.out.println("In our program we curently instantionated " + School_class.getNumberOfInstantionated_classes() + " School_class objects.");
        
        // Testing asignment of final static constant assignment in our school class
        System.out.println("Main educational language in our example school is: " + restored_school.getLearningLanguage());
    
        // basic info about teacher
        our_example_teacher.basicTeacherInfo();
        
         // create new teacher of vocational topics and show them basci info
        TeacherOfVocationalClasses our_example_vocational_teacher;
        our_example_vocational_teacher = new TeacherOfVocationalClasses("ENG CONSTRUCTION", "SKU02", "John", "DOE 2", "1.9.2020", "31.8.2021",1045.0f , 9, "Eletrical design");
           // show info about them
           our_example_vocational_teacher.basicTeacherInfo();
        
    }
}
