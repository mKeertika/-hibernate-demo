package com.test.hib.hql;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

import javax.persistence.TypedQuery;

public class FindUser_hql {
    public void findUser() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM User"; // Example of HQL to get all records of user class
        TypedQuery query = session.createQuery(hql);
        List<User> results = query.getResultList();
        for (User u : results) {
            System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getFullname()
                    + "|" + "Email: " + u.getEmail() + "|" + "password" + u.getPassword());
        }
    }
}

 class App
{
    public static void main( String[] args ) {
        FindUser_hql u = new FindUser_hql();
        u.findUser();
    }
    public void findUserSelect()
    {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        /* ------------  Example of HQL to get all the records------- */
        String hql = "SELECT u FROM User u";
        Query query = session.createQuery(hql);
        List<User> list  =  query.getResultList();
        for (User u : list) {
            System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+
            "password" + u.getPassword());
        }
    }
    public void getRecordbyId() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM User E WHERE E.id > 2 ORDER BY E.salary DESC";
        TypedQuery query = session.createQuery(hql);
        List<User> results = query.getResultList();
        for (User u : results) {
            System.out.println("User Id: " +u.getId() + "|" + " Full name:" +
                    u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
        }
    }
}