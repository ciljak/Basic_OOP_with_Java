/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mojeFunkcie; // we created new package and moved support function interface with appropriate implementation there
//In IDE NetBeans we only moved existing class and interface to new package, on open copy dialog we selected refactor
// and all necessary code for importing function has been introduced automaticaly

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;

/**
 *
 * @author Ciljak
 */
public  class ImplementationSupportFunction  implements SupportFunctions, Serializable  {
    
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
     
     // 11.4.2021 - implementation of function for saving text reports to a file
     
     public boolean saveTextToFile (String name_of_file, String Directory_to_save, String text_to_save) {
         try { 
                File new_directory = new File(Directory_to_save); // create directory fo save
                
                if (new_directory.exists() == true) { // test if direcory exist, and if not create them
                    System.out.println("Directory " + Directory_to_save + " already exists and must not to be recreated.");
                } else {
                    new_directory.mkdir();
                    System.out.println("Direcory " + Directory_to_save + " has been succesfully created.");
                            
                }
                    
                
                
                String fileLoaction = Directory_to_save + "\\" +  name_of_file; // we create full path of saved file fom directory and file name

                FileWriter fw = new FileWriter (fileLoaction); // create FileWriter for formated text output
                BufferedWriter out = new BufferedWriter(fw);

                /*while(text_to_save != null) {
                    System.out.println(text_to_save);
                    out.write(text_to_save);
                    out.newLine(); //odriadkovanie
                }*/
                out.write(text_to_save);
                
                out.close();
                return true;
        } catch (FileNotFoundException e) { // specific exception to handle - is in catch tree upper
            System.out.println("File not found");
            //throw e; optionally we can catch exception, handle them and also throw them
            e.printStackTrace(); //simple way how to handle exception if we dont expect them and only will provide simple info - output is only provided to console, bad for GUI based programs
            return false;
        } catch (IOException e) { // generall exception to handle - is located at bottom
            System.out.println("Error initializing stream");
            return false;
        }  finally {
            System.out.println("\n This part is executed every time no matter if exception has been invoked or not ... . \n");
         }
         
     };
     
    /** Variant A - Exception is properly handled in our code 
     public String readTextFromFile (String name_of_file, String Directory_from_where_to_read_save) {
         
         try { 
           String fileLoaction = Directory_from_where_to_read_save + "\\" +  name_of_file; // we create full path of saved file fom directory and file name
           
           FileReader fr = new FileReader(fileLoaction);
           BufferedReader in = new BufferedReader(fr);
           
           String line_of_text;
           String our_recreating_text_file = "";
           
           while((line_of_text = in.readLine()) != null) {
               System.out.println(line_of_text);
               our_recreating_text_file += line_of_text;
           }
           
           
           

                return our_recreating_text_file;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            return null;
        }  
      */ 
     
       //Variant B - exception is only thrown to upper level
        public String readTextFromFile (String name_of_file, String Directory_from_where_to_read_save) throws IOException { // for proper work we must update prototypes in interface that we implement
         
        
           String fileLoaction = Directory_from_where_to_read_save + "\\" +  name_of_file; // we create full path of saved file fom directory and file name
           
           FileReader fr = new FileReader(fileLoaction);
           BufferedReader in = new BufferedReader(fr);
           
           String line_of_text;
           String our_recreating_text_file = "";
           
           while((line_of_text = in.readLine()) != null) {
               //System.out.println(line_of_text);
               our_recreating_text_file += line_of_text;
               our_recreating_text_file += "\n";
           }
           
           
           

                return our_recreating_text_file;
        

     };
    
}
