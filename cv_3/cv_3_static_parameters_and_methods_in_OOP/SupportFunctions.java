
/**
 * Write a description of interface SupportFunctions here.
 * Interface make contract for further implementation of function for saving and reading serialized objects.
 * @author (Ciljak)
 * @version (v 1.0 3.4.2021)
 */
public interface SupportFunctions
{
    public boolean saveObject (String where_file_save, Object object_to_save); 
    public Object readObject (String where_file_saved);
}
