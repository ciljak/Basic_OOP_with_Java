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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        School our_school = new School("Example vocational school","Vocational school", 16 ); // we instantionate and construct our object along class teplate School
        
        // now we show values asgnet to the object properties by constructor
        System.out.println("Name of our example school is: " + our_school.getName());
        System.out.println("Type of our school is: " + our_school.getType() + " and number of classes is " + our_school.getNrOfClasses());
        
        // now we will change object parameter directly - it will result into a error because they are encapsulated and private
        //our_school.name = "New name assigned directly";
        
        // and now we do it right way with prepared seter method
        our_school.setName("New example vocational school");
        our_school.setType("Practical");
        
        // and now what we obtained
        System.out.println("Thanx of our seter method our object changed name properties: " + our_school.getName());
         System.out.println("toString description of our school object with name our_school is: " + our_school.toString());

    }
    
}
