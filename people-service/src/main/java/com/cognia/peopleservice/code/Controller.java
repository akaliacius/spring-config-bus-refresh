package com.cognia.peopleservice.code;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Autowired
    private Person person;

    @Value("${person.firstName}")
    private String name;

    @GetMapping("/service")
    public @ResponseBody Person person(){
        return this.person;
    }

    @GetMapping("/test")
    public String show(){
        return this.name;
    }
}
