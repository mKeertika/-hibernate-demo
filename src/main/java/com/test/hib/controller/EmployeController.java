package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.Employee;

public class EmployeController {
    public void createEmployeeTable() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Employee uone = new Employee();
        t.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();
    }
}

