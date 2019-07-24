package moh.ask.restcrud.controller;

import moh.ask.restcrud.model.Member;
import moh.ask.restcrud.service.TestService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController

public class Controller {



  @Autowired
    private TestService testService;






    @PostMapping("/add")
    public void addMember(@RequestBody Member member){

        System.out.println(member);
        testService.save(member);

        System.out.println("member id : "+member.getId());




    }



}
