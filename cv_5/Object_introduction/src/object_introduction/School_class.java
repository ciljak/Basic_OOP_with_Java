/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_introduction;

import java.io.Serializable;

/**
 *
 * @author Phenom
 */
public class School_class implements  Serializable {
    public String name;
    public String short_name;
    public int number_of_students;
    public Teacher classTeacher; // this atribut is a member of our own object Teacher
    
    private static int number_of_instantionated_classes; // we introduce static or class variable (you can mean on it as on a global variable in class
    
    
    
    
// constructor
    public School_class(String name, String short_name, int number_of_students, Teacher classTeacher) {
        this.name = name;
        this.short_name = short_name;
        this.number_of_students = number_of_students;
        this.classTeacher = classTeacher;
        
        School_class.number_of_instantionated_classes++; // after all instantiatin of the clas we icrement number of them
    }
     public School_class() { // void constructor
        School_class.number_of_instantionated_classes++; // after all instantiatin of the clas we icrement number of them
    }
    // static methot for obtaining number of instantionate school_class objects
     public static int getNumberOfInstantionated_classes ()     {
         return School_class.number_of_instantionated_classes;
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
