/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_introduction;

/**
 * 
 * @author Phenom
 */
public class School {
    // atributes of our example class
    private String name;
    private String type;
    private int nrOfClasses;

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
    
    
    
    
    
}
