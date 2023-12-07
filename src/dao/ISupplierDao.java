package dao;

import java.util.List;
import model.Supplier;

/**
 *
 * @author tusobrino
 */
public interface ISupplierDao 
{
    public List<Supplier> getAllSuppliers();
    public Supplier getContact(String contactID);
    public boolean addContact(Supplier contact);
    public boolean updateContact(Supplier contact);
    public boolean deleteContact(String contactId);    
}
