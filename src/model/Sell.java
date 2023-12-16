package model;

/**
 *
 * @author Daniel Casvill
 */
public class Sell 
{
    private String customer;
    private String product;
    private int unitPrice;
    private int quantity;
    private int total;   

    public Sell(String customer, String product, int unitPrice, int quantity, int total) 
    {
        this.customer = customer;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
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
