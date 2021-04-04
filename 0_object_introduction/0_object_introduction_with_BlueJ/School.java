
/**
 * Example of modeling real object of school.
 *
 * @author (Ciljak)
 * @version (3.4.2021)
 */
public class School
{
    // instance variables
    private String name;
    private String type;
    private int nrOfClasses;

    /**
     * Constructor for objects of class School - there are two overloading constructors
     */
    
    public void School() { // default void constructor
        
    }
    
     public School(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public School(String name, String type, int nrOfClasses) {
        this.name = name;
        this.type = type;
        this.nrOfClasses = nrOfClasses;
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
}
