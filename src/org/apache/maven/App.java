package org.apache.maven;

import org.hibernate.Session;
import org.apache.persistence.HibernateUtil;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Customer Account = new Customer();

        Account.setID("471561");
        Account.setName("GENM61");
        Account.setSurname("GENM61");
        Account.setPassword("GENM61");
        Account.setPayment("GENM6");

        Seller Account1 = new Seller();

        Account1.setID("47156");
        Account1.setName("GENM6");
        Account1.setSurname("GENM6");
        Account1.setPassword("GENM6");
        Account1.setPayment("GENM6");

        /*Goods Account2 = new Goods();

        Account2.setPrice("47156");
        Account2.setName("GENM6");
        Account2.setDetail("GENM6");
        Account2.setSeller("GENM6");
        Account2.setQuantity("GENM6");*/
        
        session.save(Account);
        session.save(Account1);
        //session.save(Account2);
        session.getTransaction().commit();
    }
}
