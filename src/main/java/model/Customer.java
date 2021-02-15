/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author ChickDev03
 */
public class Customer {
    private int CustomerNumber;
    private String CustomerName;
    private String ContactLastName;
    private String ContactFirstName;
    private String Phone;
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;
    private double CreditLimit;

    public Customer(String customerName, String contactLastName, String contactFirstName, String phone, 
String addressLine1, String addressLine2, String city, String state, String postalCode, double creditLimit ){
       this.CustomerName = customerName;
       this.ContactLastName = contactLastName;
       this.ContactFirstName = contactFirstName;
       this.AddressLine1 = addressLine1;
       this.AddressLine2 = addressLine2;
       this.City = city;
       this.State = state;
       this.PostalCode = postalCode;
       this.CreditLimit = creditLimit;
    }

    public Customer(int customerNumber, String customerName, String contactLastName, String contactFirstName, String phone, 
String addressLine1, String addressLine2, String city, String state, String postalCode, double creditLimit ){
        this.CustomerNumber = CustomerNumber;
       this.CustomerName = customerName;
       this.ContactLastName = contactLastName;
       this.ContactFirstName = contactFirstName;
       this.AddressLine1 = addressLine1;
       this.AddressLine2 = addressLine2;
       this.City = city;
       this.State = state;
       this.PostalCode = postalCode;
       this.CreditLimit = creditLimit;
    }
    
    public int getCustomerNumber(){
        return this.CustomerNumber;
    }
    public String getCustomerName(){
        return this.CustomerName;
    }
    public void  setCustomerName(String name){
        this.CustomerName = customerName;
    }
    public String getContactLastName(){
        return this.ContactLastName;
    }
    public void  setContactLastName(String contactLastName){
        this.ContactLastName = contactLastName;
    }

        public String getPhone(){
        return this.Phone;
    }
    public void  setPhone(String phone){
        this.Phone = phone;
    }

            public String getAddressLine1(){
        return this.AddressLine1;
    }
    public void  setAddressLine1(String addressLine1){
        this.AddressLine1 = addressLine1;
    }
            public String getAddressLine2(){
        return this.AddressLine2;
    }
    public void  setAddressLine2(String addressLine2){
        this.AddressLine2 = addressLine2;
    }
            public String getCity(){
        return this.City;
    }
            public String getState(){
        return this.State;
    }
    public void  setState(String state){
        this.State = state;
    }

            public String getPostalCode(){
        return this.PostalCode;
    }
    public void  setPostalCode(String postalCode){
        this.PostalCode = postalCode;
    }

            public String getCreditLimit(){
        return this.CreditLimit;
    }
    public void  setCreditLimit(double creditLimit){
        this.CreditLimit = creditLimit;
    }

    
}
