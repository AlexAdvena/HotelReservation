package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomerService {
    private String email;
    private  String firstName;
    private  String lastName;
    private  String customerEmail;
    public List<Customer> customers =new ArrayList<Customer>();

    public CustomerService (String email, String firstName, String lastName, String customerEmail){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerEmail = customerEmail;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getFirstName (){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName (){
        return lastName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getCustomerEmail (){
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }


    public void addCustomer (String email, String firstName, String lastName){
        customers.add(new Customer(firstName, lastName, email));

    }

    public Customer getCustomer(String customerEmail) {
        for (Customer customer : customers){
            if (customerEmail.equalsIgnoreCase(customerEmail)){
                return customer;
            }

            }
        return null;
        }



    public Collection<Customer> getAllCustomers() {

        return customers;
    }

}
