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
    private String GoodsID;

    public SellerData() {
    }

    public SellerData(String name, String surname, String id, String password, String payment ,String CustomerList) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
        this.GoodsID = CustomerList;
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
    public String getGoodsID() {
        return this.GoodsID;
    }

    public void setGoodsID(String CustomerList) {
        this.GoodsID = CustomerList;
    }
}

