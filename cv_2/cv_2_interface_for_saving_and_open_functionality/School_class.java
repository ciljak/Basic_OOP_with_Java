
/**
 * Write a description of class School_class here. School clases are mebers of appropriate school organisation.
 *
 * @author (Ciljak)
 * @version (1.0 3.4.2021)
 */
import java.io.Serializable; // important API package for Serialization

public class School_class implements  Serializable //implements serializable interface for further objects serlialisation
{
    public String name;
    public String short_name;
    public int number_of_students;
    public Teacher classTeacher; // this atribut is reference variable (not primitive) 
    // a member of our own class Teacher
    
    
// constructor
    public School_class(String name, String short_name, int number_of_students, Teacher classTeacher) {
        this.name = name;
        this.short_name = short_name;
        this.number_of_students = number_of_students;
        this.classTeacher = classTeacher;
    }
     public School_class() { // void constructor
       
    }

    // geters and seters  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public int getNumber_of_students() {
        return number_of_students;
    }

    public void setNumber_of_students(int number_of_students) {
        this.number_of_students = number_of_students;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }
}
