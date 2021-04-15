/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javafx.beans.property.SimpleStringProperty;
 
public class Person {
   private final SimpleStringProperty firstName = new SimpleStringProperty("");
   private final SimpleStringProperty phone = new SimpleStringProperty("");
   private final SimpleStringProperty email = new SimpleStringProperty("");
   private final SimpleStringProperty address = new SimpleStringProperty("");

public Person() { //this is the person in the table
        this("", "", "", "");
    }
 
    public Person(String firstName, String phone, String email, String address) {
        setFirstName(firstName);
        setPhone(phone);
        setEmail(email);
        setAddress(address);
    }

    public String getFirstName() {
        return firstName.get();
    }
 
    public void setFirstName(String fName) {
        firstName.set(fName);
    }
        
    public String getPhone() {
        return phone.get();
    }
    
    public void setPhone(String fName) {
        phone.set(fName);
    }
    
    public String getEmail() {
        return email.get();
    }
    
    public void setEmail(String fName) {
        email.set(fName);
    }
    
    public String getAddress() {
        return address.get();
    }
    
    public void setAddress(String fName) {
        address.set(fName);
    }
}
