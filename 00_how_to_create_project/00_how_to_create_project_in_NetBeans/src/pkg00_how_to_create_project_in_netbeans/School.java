/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_how_to_create_project_in_netbeans;

/**
 *
 * @author Ciljak
 */
public class School {
 // instance variables
    private String name;
    private String type;
    private int nrOfClasses;

    /**
     * Constructor for objects of class School - there are two overloading constructors
     */
    public void School() {
        
    }
    
    public void School(String meno) {
        this.name = meno;
        
    }

    public School(String name, String type, int nrOfClasses) {
        this.name = name;
        this.type = type;
        this.nrOfClasses = nrOfClasses;
    }

    public School(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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
    
    // overriding from Object inherited method toString()
    
    @Override
    public String toString() {
        return (this.name+this.type+this.nrOfClasses);
        
    }

   
}
