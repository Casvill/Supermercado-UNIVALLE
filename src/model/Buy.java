package model;

/**
 *
 * @author Daniel Casvill
 */
public class Buy 
{
    private String supplier;
    private String product;
    private int price;
    private int quantity;
    private int total;    

    public Buy(String supplier, String product, int price, int quantity, int total) 
    {
        this.supplier = supplier;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }       
}
