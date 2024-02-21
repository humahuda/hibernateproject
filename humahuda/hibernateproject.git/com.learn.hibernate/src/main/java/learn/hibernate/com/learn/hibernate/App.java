package learn.hibernate.com.learn.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
     
      Bike b1 = new Bike(109,"suzki",80000);
      Bike b2 = new Bike(110,"Bajaj",90000);
      
      Configuration cfg = new Configuration();
      cfg.configure();
      
      SessionFactory factory = cfg.buildSessionFactory();
      Session session = factory.openSession();
      Transaction tx = session.beginTransaction();
      
     
      session.save(b1);
      session.save(b2);

      
      tx.commit();
      
      
      
    }
}
