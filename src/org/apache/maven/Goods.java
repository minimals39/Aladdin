package org.apache.maven;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;
import aladdin.CustomerData;
=======
>>>>>>> parent of eb2c7b5... Make order succes
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
                            String number1 = "1";
                            Session session = HibernateUtil.getSessionFactory().openSession();

                            session.beginTransaction();
                            Order order = new Order();
                            order.setSeller(this.seller);
                            order.setPrice(this.price);
                            session.save(order);
                            String number = Integer.toString(this.no);
                            String sql = "SELECT * FROM aladdin.goods WHERE ID ="+number;
                            SQLQuery query = session.createSQLQuery(sql);
                            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                            List data = query.list();
                            for(Object object : data) {
                            Map row = (Map)object;
                            number1 = (String)row.get("quantity"); }
                            int No1 = Integer.parseInt(number1);
                            No1 -= 1;
                            String sql2 = "UPDATE aladdin.goods SET quantity = :No1"+"Where no = :no";
                            SQLQuery query2 = session.createSQLQuery(sql2);
                            query2.setParameter("No1",No1);
                            query2.setParameter("no",this.no);
                            int result = query2.executeUpdate();
                                
                                
            
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