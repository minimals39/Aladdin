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
/*
How 2 use 
CustomerData customerdata = CustomerData.getinstance();
customerdata,set****(**);
customerdata.get****();

*/
public class CustomerData {
    
    private static  String name;
    private static  String surname;
    private static  String payment;
    private static  String GoodsID;
    private static  String Address;
    private static CustomerData instance;
    
    public static CustomerData getInstance() {
        if (instance == null) {
             instance = new CustomerData();
        }
        return instance;
    }
    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }


    private CustomerData() {
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

    public void setGoodsID(String GoodsID) {
        this.GoodsID = GoodsID;
    }
}

