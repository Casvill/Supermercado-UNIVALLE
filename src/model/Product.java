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
    private int price;
    private int quantity;

    public Product(String id, String productName, String supplier, int price, int quantity) 
    {
        this.id = id;
        this.productName = productName;
        this.supplier = supplier;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
