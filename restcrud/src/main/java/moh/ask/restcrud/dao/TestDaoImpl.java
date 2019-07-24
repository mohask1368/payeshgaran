package moh.ask.restcrud.dao;

import moh.ask.restcrud.model.Member;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Member member) {
        sessionFactory.getCurrentSession().save(member);
    }
}
