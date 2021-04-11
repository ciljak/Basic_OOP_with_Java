
/**
 * School object represent model of major organisation that consists classes, employees and working teachers.
 *
 * @author (Ciljak)
 * @version (v 1.0 3.4.2021)
 */

import java.util.ArrayList; // example of importing Java API package for support of work with ArrayList data structure
import java.io.Serializable; // important API package for Serialization
public class School implements Serializable
{
    // atributes of our example class
    private String name;
    private String type;
    private int nrOfClasses;
    private ArrayList<School_class> allSchoolClasses = new ArrayList<School_class>(); // Java list of objects
    
    private String learningLanguage = ProgramConstants.LANGUAGE;

    // example of constructors
    public School(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public School(String name, String type, int nrOfClasses) {
        this.name = name;
        this.type = type;
        this.nrOfClasses = nrOfClasses;
    }
    
    // setters - how to automaticaly generate them
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNrOfClasses(int nrOfClasses) {
        this.nrOfClasses = nrOfClasses;
    }
    
    //getters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getNrOfClasses() {
        return nrOfClasses;
    }

    public String getLearningLanguage() { // only getter introduced, because setting language is through final static cosntatnt from ProgramConstants class
        return learningLanguage;
    }
    
    
    
    
    // method for adding and removing class from list of school classes
    public void addClassIntoSchool (School_class our_school_class) {
        this.allSchoolClasses.add(our_school_class); // add is a method of List for inserting new items into a list
        
        
    }
    
    public void removeClasFromSchool (School_class our_school_class) {
        this.allSchoolClasses.remove(our_school_class); // remove items from list
    }
    
    public void showAllSchoolClasses() {
           int i=0;
           School_class curent_working_class = new School_class();
           
           System.out.println("");
           System.out.println("Our school currently consist of these classes:");
           System.out.println("----------------------------------------------");
            
           while (i < allSchoolClasses.size()) {
            // get current working object 
            curent_working_class = allSchoolClasses.get(i);
            System.out.println(curent_working_class.name + " is wisiting " + curent_working_class.number_of_students + " students and class teacher is " + curent_working_class.classTeacher.getFirstname() + " "+ curent_working_class.classTeacher.getLastname() );
            i++;
        }
        
    }
    
    //Inner class - hold school specific data that can be accessed only from a School class
    
   private class InnerClassEDUID implements Serializable {  // musst implement serializable for availability of serialization of inner object during saving outer School class
      private String EDUID_number; // private variable (atribute) of Inner Class
        // inner class Getters and setters
        public String getEDUID_number() {
            return EDUID_number;
        }

        public void setEDUID_number(String EDUID_number) {
            this.EDUID_number = EDUID_number;
        }
      
        public void print() { // method for a display static content
           System.out.println("This is an inner class example displaying EDUID code: " + this.EDUID_number);
        }
        
        public void print_info(String info) { // method for display content passed as a argument of the function
           System.out.println(info);
        }
   }
   
   // instantionate inner class
   InnerClassEDUID inner = new InnerClassEDUID();
   // Accessing he inner class from the method within
   void display_EDUIDofInnerClassEDUID() { // method that manipulate with inner method variable but is accessible from out of school class
      
     
      inner.getEDUID_number();
      inner.print();
   }
   
   void set_EDUIDofInnerClassEDUID(String EDUID) { // method that manipulate with inner method variable but is accessible from out of school class
      // outer class instantionate a outer class
      
      String oldEduid = inner.getEDUID_number(); 
      // get previous EDUID number
      inner.setEDUID_number(EDUID);
      inner.print_info("We reset EDUID from " + oldEduid + " to new value: " + inner.getEDUID_number());
   } 
    
}
