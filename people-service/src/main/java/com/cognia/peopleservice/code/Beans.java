package com.cognia.peopleservice.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Autowired
    private PersonProps personProps;

    @Bean
    @Scope("prototype")
    public Person person(){
        Person p = new Person();
        p.setFirstName(personProps.getFirstName());
        p.setLastName(personProps.getLastName());
        p.setTown(personProps.getTown());
        p.setAge(personProps.getAge());
        return p;
    }
}
