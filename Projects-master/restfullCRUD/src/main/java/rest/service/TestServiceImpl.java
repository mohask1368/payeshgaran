package rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.model.Member;
import rest.repository.Test;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private Test test;

    @Override
    public void save(Member member) {
        test.save(member);
    }
}
