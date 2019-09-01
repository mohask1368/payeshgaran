package rest.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.model.Member;

@Repository
public class TestImpl implements Test {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Member member) {
        sessionFactory.getCurrentSession().save(member);
    }
}
