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
    private static String name;
    private static String surname;
    private static String payment;
    private static String GoodsID;
    private static SellerData instance;
    
    
    public static SellerData getinstance(){
         if (instance == null) {
             instance = new SellerData();
        }
        return instance;
    }

    private SellerData() {
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

