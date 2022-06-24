package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
private String firstName;
private String lastName;
private String email;

public Customer (String firstName, String lastName, String email){
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
}
//Not clear how to implement regex and exception
String emailRegex = "^(.+)@(.+).(.+)$";
Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
    this.firstName = firstName;
    }

    public String getLastName(){
    return lastName;
    }
    public void setLastName (String lastName){
    this.lastName = lastName;
    }

    public String getEmail(){
    return email;
    }
    public void setEmail(String email){
    this.email = email;
    }

    @Override
    public String toString(){
    return firstName+" "+lastName+" "+email;
    }
}
