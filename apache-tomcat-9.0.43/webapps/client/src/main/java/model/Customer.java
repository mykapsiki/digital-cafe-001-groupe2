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
    private string CustomerName;
    private string ContactLastName;
    private string ContactFirstName;
    private string Phone;
    private string AddressLine1;
    private string AddressLine2;
    private string City;
    private string State;
    private string PostalCode;
    private double CreditLimit;

    public Customer(string customerName, string contactLastName, string contactFirstName, string phone, 
string addressLine1, string addressLine2, string city, string state, string postalCode, double creditLimit ){
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
    public string getCustomerName(){
        return this.CustomerName;
    }
    public void  setCustomerName(string name){
        this.CustomerName = customerName;
    }
    public string getContactLastName(){
        return this.ContactLastName;
    }
    public void  setContactLastName(string contactLastName){
        this.ContactLastName = contactLastName;
    }

        public string getContactLastName(){
        return this.ContactLastName;
    }
    public void  setContactLastName(string contactLastName){
        this.ContactLastName = contactLastName;
    }
        public string getPhone(){
        return this.Phone;
    }
    public void  setPhone(string phone){
        this.Phone = phone;
    }

            public string getAddressLine1(){
        return this.AddressLine1;
    }
    public void  setAddressLine1(string addressLine1){
        this.AddressLine1 = addressLine1;
    }
            public string getAddressLine2(){
        return this.AddressLine2;
    }
    public void  setAddressLine2(string addressLine2){
        this.AddressLine2 = addressLine2;
    }
            public string getCity(){
        return this.City;
    }
    public void  setAddressLine2(string city){
        this.City = city;
    }

            public string getState(){
        return this.State;
    }
    public void  setState(string state){
        this.State = state;
    }

            public string getPostalCode(){
        return this.PostalCode;
    }
    public void  setPostalCode(string postalCode){
        this.PostalCode = postalCode;
    }

            public string getCreditLimit(){
        return this.CreditLimit;
    }
    public void  setCreditLimit(double creditLimit){
        this.CreditLimit = creditLimit;
    }

    
}
