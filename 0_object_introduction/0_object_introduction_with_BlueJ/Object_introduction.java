

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Object_introduction.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Object_introduction
{
    /**
     * Default constructor for test class Object_introduction
     */
    public static void main(String[] args) { // entry class in java
        // TODO code application logic here
        
        School our_school = new School("Example vocational school","Vocational school", 16 ); // we instantionate and construct our object along class teplate School
        
        // now we show values asgnet to the object properties by constructor
        System.out.println("Name of our example school is: " + our_school.getName());
        System.out.println("Type of our school is: " + our_school.getType() + " and number of classes is " + our_school.getNrOfClasses());
        
        // now we will change object parameter directly - it will result into a error because they are encapsulated and private
        //our_school.name = "New name assigned directly";
        
        // and now we do it right way with prepared seter method
        our_school.setName("New example vocational school");
        
        // and now what we obtained
        System.out.println("Thanx of our seter method our object changed name properties: " + our_school.getName());
        
        
    }
}
