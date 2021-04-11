/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mojeFunkcie; // we created new package and moved support function interface with appropriate implementation there
//In IDE NetBeans we only moved existing class and interface to new package, on open copy dialog we selected refactor
// and all necessary code for importing function has been introduced automaticaly
import java.io.IOException;



/**
 * This interface introduce functions (contract for implementing them) for save/ open functionality.
 * @author Ciljak
 */
 public interface SupportFunctions {
    public  boolean saveObject (String where_file_save, Object object_to_save); 
    public  Object readObject (String where_file_saved);
    
    // 11.4.2021 - function for saving text reports in to a file
    public boolean saveTextToFile (String name_of_file, String Directory_to_save, String text_to_save);
    public String readTextFromFile (String name_of_file, String Directory_from_where_to_read_save) throws IOException;
    
}
