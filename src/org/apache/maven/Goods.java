package org.apache.maven;

import aladdin.CustomerData;
import aladdin.cart;
import org.hibernate.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import org.apache.persistence.HibernateUtil;

public class Goods implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer no;
    private String name;
    private String price;
    private String detail;
    private String seller;
    private String quantity;
    private final Button addtocart = new Button("Add to cart");

                    {
                        addtocart.setOnAction((ActionEvent event) -> {
                            Session session = HibernateUtil.getSessionFactory().openSession();

                            session.beginTransaction();
                            Order order = new Order();
                            order.setSeller(this.seller);
                            order.setPrice(this.price);
                            CustomerData customerData = CustomerData.getInstance();
                            order.setCustomer(customerData.getName());
                            session.save(order);
                            session.getTransaction().commit();
                        });
                    }


    public Goods() {
    }

    public Goods(String name, String price, String detail, String seller, String quantity) {
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.seller = seller;
        this.quantity = quantity;
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

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSeller() {
        return this.seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Button getAddtocart() {
        return addtocart;
    }

}