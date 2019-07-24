package moh.ask.controller;

import moh.ask.model.Auth;
import moh.ask.model.Member;
import moh.ask.model.MemberContainer;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller {



    @PostMapping("/authentication")
    public String authentication(@RequestBody Auth auth) throws IOException {


        String message = null;


        for (Member member : MemberContainer.getMemberList()) {
            if (auth.getUsername().equals(member.getUsername()) && auth.getPassword().equals(member.getPassword())) {

                Runtime runtime = Runtime.getRuntime();
                runtime.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://localhost:7070/message.html");
                message = "login success";


            } else {
                message = "username or password is incorrect !!! ";

            }
        }
        return message;
    }


    @PostMapping("/register")
    public String register(@RequestBody Member member){

        List<Member> list = MemberContainer.getMemberList();
        list.add(member);
        return "register successfull";
    }




}
