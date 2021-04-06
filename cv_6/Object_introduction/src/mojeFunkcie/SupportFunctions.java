/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mojeFunkcie; // we created new package and moved support function interface with appropriate implementation there
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
