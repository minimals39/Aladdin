package org.apache.maven;

public class Goods implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer no;
    private String name;
    private String price;
    private String detail;
    private String seller;
    private String quantity;

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
}