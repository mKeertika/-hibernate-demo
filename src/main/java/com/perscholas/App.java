package com.perscholas;

import com.perscholas.model.Department;
import com.perscholas.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Teacher t1 = new Teacher();
        t1.setSalary("1000");
        t1.setTeachername("MHaseeb");

        Teacher t2 = new Teacher();
        t2.setSalary("2220");
        t2.setTeachername("Shahparan");

        Teacher t3 = new Teacher();
        t3.setSalary("30000");
        t3.setTeachername("James");

        Teacher t4 = new Teacher();
        t4.setSalary("40000");
        t4.setTeachername("Joseph");

        Teacher t5 = new Teacher();
        t5.setSalary("200");
        t5.setTeachername("Ali");

        //Add teacher entity object to the list
        List<Teacher> teachlist1 = new ArrayList();
        teachlist1.add(t1);
        teachlist1.add(t2);
        teachlist1.add(t3);

        List<Teacher> teachlist2 = new ArrayList();
        teachlist2.add(t4);
        teachlist2.add(t5);

        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        session.save(t5);

        //Create Department
        Department department1 = new Department();
        department1.setDname("Development");
        Department department2 = new Department();
        department2.setDname("Marketing");

        department1.setTeachers(teachlist1);
        department2.setTeachers(teachlist2);

        //Store Department
        session.save(department1);
        session.save(department2);

        t.commit();
    }
}
