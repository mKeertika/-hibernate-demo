package crud.department.controller;

import crud.department.model.DeptMain;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class CreateDept {
    public static void main(String[] args) {

// TODO Auto-generated method stub
        SessionFactory factory = new
        Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        DeptMain deptone = new DeptMain("department1", "Tx");
        DeptMain depttwo = new DeptMain("department2", "IL");
        DeptMain deptthree = new DeptMain("department3", "NY");

        session.save(deptone);
        session.save(depttwo);
        session.save(deptthree);

        t.commit();

        System.out.println("data saved successfully");
        factory.close();
        session.close();



    }

}
