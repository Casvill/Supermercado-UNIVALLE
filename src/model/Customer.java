package model;

import java.io.Serializable;

/**
 *
 * @author Daniel Casvill
 */
public class Customer implements Serializable
{
    public static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String surnames;
    private String phoneNumber;

    public Customer(String id, String name, String surnames, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surnames = surnames;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    
}
