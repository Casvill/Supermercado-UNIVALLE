package dao;

import java.util.ArrayList;
import java.util.List;
import model.Supplier;

/**
 *
 * @author Daniel Casvill
 */
public class SupplierDaoImplementation implements ISupplierDao
{
    List<Supplier> suppliers;
    
    public SupplierDaoImplementation()
    {
        this.suppliers = new ArrayList<>();
    }
    

    @Override
    public List<Supplier> getAllSuppliers() 
    {
        return suppliers;
    }

    @Override
    public Supplier getSupplier(String supplierID) 
    {
        Supplier supplier = null;
        
        for(Supplier current : suppliers)
        {
            if(current.getId().equals(supplierID))
            {
                supplier = current;
                break;
            }
        }
        
        return supplier;
    }

    @Override
    public boolean addSupplier(Supplier supplier) 
    {
        for(Supplier supplierB: suppliers)
        {
            if(supplierB.getId().strip().equals(supplier.getId().strip()))
            {
                return false;
            }
        }
        
        suppliers.add(supplier);
        return true;
    }

    @Override
    public boolean updateSupplier(Supplier supplier) 
    {
        for(Supplier supplierB: suppliers)
        {
            if(supplierB.getId().strip().equals(supplier.getId().strip()))
            {
                int pos = suppliers.indexOf(supplierB);
                suppliers.set(pos, supplier);
            
                return true;
            }
        }
        
        return false;
    }

    @Override
    public boolean deleteSupplier(String supplierId) 
    {
        for(Supplier supplierB: suppliers)
        {
            if(supplierB.getId().strip().equals(supplierId.strip()))
            {
                int pos = suppliers.indexOf(supplierB);
                suppliers.remove(pos);
                return true;
            }
        }
        return false;
    }
    
}
