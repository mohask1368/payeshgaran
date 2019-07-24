package moh.ask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


@RestController
public class Controller {




@GetMapping("/get")
public void postToUser(){

    System.out.println("get method invoked");

}





@PostMapping(value = "/test")
public Integer getFromUser(@RequestBody String s) throws ScriptException {

    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    Integer result = (Integer) engine.eval(s);




    return result;


}




}
