package moh.ask.restcrud.service;

import moh.ask.restcrud.dao.TestDao;
import moh.ask.restcrud.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;
    public void save(Member member){
        testDao.save(member);
    }
}
