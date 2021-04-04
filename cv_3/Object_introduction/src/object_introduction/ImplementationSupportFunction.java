/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_introduction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;

/**
 *
 * @author Phenom
 */
public  class ImplementationSupportFunction implements SupportFunctions, Serializable {
    
     public  boolean saveObject (String where_file_save, Object object_to_save) {
         
         try {
            FileOutputStream f = new FileOutputStream(new File(where_file_save));
            ObjectOutputStream o = new ObjectOutputStream(f);

            
            
            System.out.println("We save object with ID:" + object_to_save.toString());
            
            // Write objects to file
            o.writeObject(object_to_save);

            o.close();
            f.close();

            return true;

       } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return false;
        } catch (IOException e) {
            System.out.println("Error initializing stream");
           return false;
        }
        
         
     }
     
     public  Object readObject (String where_file_saved) {
         
          try { //exception handling in Java code - try introduce part where exception can be generated
            
            //
            FileInputStream fi = new FileInputStream(new File(where_file_saved));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            
            // example of reading serialized objects object School pr1 = (School) oi.readObject();
           
            Object restored_object = oi.readObject();

            System.out.println("We read object with ID:" + oi.toString());
            
            
            oi.close();
            fi.close();
            
            return  restored_object; // return read object

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            return null;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
         
         
         
     }
    
}
