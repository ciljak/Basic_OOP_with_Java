/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_introduction; // our code is from package

// way how to import a package
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Ciljak
 */
public class Object_introduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // entry class in java
        // TODO code application logic here
        
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
        
        
        
    }
    
}
