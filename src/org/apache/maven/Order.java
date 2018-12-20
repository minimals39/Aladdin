/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.maven;

import aladdin.cart;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

/**
 *
 * @author WIN10
 */
public class Order {
    private Integer no;
    private String Price;
    private String Seller;
    private String Customer;
    private String Address;
    private String Name;
    private boolean status;
    private final Button sendgoods = new Button("sendgoods");

                    {
                        sendgoods.setOnAction((ActionEvent event) -> {
                            
                        });
                    }

    public Order() {
        /*if(status){        sendgoods.setDisable(true);
             }
        else{
        sendgoods.setDisable(false);
        }*/
    }

    public Order(String Price, String Seller, String Customer,String Address,String Name) {
        this.Price = Price;
        this.Seller = Seller;
        this.Customer = Customer;
        this.Address = Address;
        this.Name = Name;

    }

    public Integer getNo() {

        return this.no;
    }

    public void setno(Integer no) {
        this.no = no;
    }
    
    public String getPrice() {
        return this.Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSeller() {
        return this.Seller;
    }

    public void setSeller(String Seller) {
        this.Seller = Seller;
    }
    public String getCustomer() {
        return this.Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

   
}