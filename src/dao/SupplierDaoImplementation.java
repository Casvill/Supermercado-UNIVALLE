package dao;

import backupSystem.BackupSystem;
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
    BackupSystem backup = new BackupSystem();

    
    public SupplierDaoImplementation()
    {        
        try
        {
            this.suppliers = backup.loadDataSupplier();
        }
        catch(Exception exception)
        {
            this.suppliers = new ArrayList<>();
        }
    }
    
    public void doBackup()
    {
        this.backup.saveDataSupplier(suppliers);
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
        doBackup();
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
                doBackup();
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
                doBackup();
                return true;
            }
        }
        return false;
    }
    
}
