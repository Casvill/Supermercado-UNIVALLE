/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daniel tutio
 */
public class Supplier
{
    private String id;
    private String name;
    private String surnames;
    private String phoneNumber;
    
    public Supplier (String id, String name, String surnames, String phoneNumber) {
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
    
    public String getSurName() {
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
