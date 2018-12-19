/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.maven;

/**
 *
 * @author WIN10
 */
public class Order {
    private Integer no;
    private String Price;
    private String Seller;
    private String Customer;

    public Order() {
    }

    public Order(String Price, String Seller, String Customer) {
        this.Price = Price;
        this.Seller = Seller;
        this.Customer = Customer;

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