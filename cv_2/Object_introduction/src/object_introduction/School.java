/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_introduction;

import java.util.ArrayList;

/**
 * 
 * @author Phenom
 */
public class School {
    // atributes of our example class
    private String name;
    private String type;
    private int nrOfClasses;
    private ArrayList<School_class> allSchoolClasses = new ArrayList<School_class>(); // Java list of objects

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
    
    
    
    
}
