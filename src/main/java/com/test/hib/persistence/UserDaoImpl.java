package com.test.hib.persistence;

import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDaoImpl implements UserDao {
    @Override
    public void createUser(User user) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(user);
    }

    @Override
    public User findUser(int id) {
        return null;
    }
}
