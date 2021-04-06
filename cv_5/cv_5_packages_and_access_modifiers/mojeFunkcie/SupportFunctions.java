package mojeFunkcie; // our new package for better code organisation


/**
 * Write a description of interface SupportFunctions here.
 *
 * @author (Ciljak)
 * @version (v 1.0 6.4.2021)
 */
 // we created new package and moved support function interface with appropriate implementation there
//In IDE NetBeans we only moved existing class and interface to new package, on open copy dialog we selected refactor
// and all necessary code for importing function has been introduced automaticaly

/**
 * This interface introduce functions (contract for implementing them) for save/ open functionality.
 * @author Ciljak
 */
public interface SupportFunctions {
    public  boolean saveObject (String where_file_save, Object object_to_save); 
    public  Object readObject (String where_file_saved);
    
}
