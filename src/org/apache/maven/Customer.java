package org.apache.maven;

public class Customer implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer no;
    private String name;
    private String surname;
    private String ID;
    private String password;
    private String payment;

    public Customer() {
    }

    public Customer(String name, String surname, String id, String password, String payment) {
        this.name = name;
        this.surname = surname;
        this.ID = id;
        this.password = password;
        this.payment = payment;
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
}