package org.apache.maven;

public class Seller implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer no;
    private String name;
    private String surname;
    private String ID;
    private String password;
    private String payment;
    private String CustomerList;

    public Seller() {
    }

    public Seller(String name, String surname, String id, String password, String payment ,String CustomerList) {
        this.name = name;
        this.surname = surname;
        this.ID = id;
        this.password = password;
        this.payment = payment;
        this.CustomerList = CustomerList;
    }

    public Integer getNo() {

        return this.no;
    }

    public void setno(Integer no) {
        this.no = no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String Password) {
        this.password = Password;
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