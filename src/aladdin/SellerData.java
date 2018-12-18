/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin;

/**
 *
 * @author WIN10
 */
public class SellerData {
    private String name;
    private String surname;
    private String payment;
    private String CustomerList;

    public SellerData() {
    }

    public SellerData(String name, String surname, String id, String password, String payment ,String CustomerList) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
        this.CustomerList = CustomerList;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String Payment) {
        this.payment = Payment;
    }
    public String getCustomerList() {
        return this.CustomerList;
    }

    public void setCustomerList(String CustomerList) {
        this.CustomerList = CustomerList;
    }
}

