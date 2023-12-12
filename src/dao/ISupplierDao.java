package dao;

import java.util.List;
import model.Supplier;

/**
 *
 * @author Daniel Casvill
 */
public interface ISupplierDao 
{
    public List<Supplier> getAllSuppliers();
    public Supplier getSupplier(String supplierID);
    public boolean addSupplier(Supplier supplier);
    public boolean updateSupplier(Supplier supplier);
    public boolean deleteSupplier(String supplierId);
    
}
