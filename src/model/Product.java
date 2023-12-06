package model;

/**
 *
 * @author Daniel Casvill
 */
public class Product 
{
    private String id;
    private String productName;
    private String supplier;
    private String productDescription;
    private int quantity;

    public Product(String id, String productName, String supplier, String productDescription, int quantity) {
        this.id = id;
        this.productName = productName;
        this.supplier = supplier;
        this.productDescription = productDescription;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
