package com.cognia.carservice.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Autowired
    private CarProps carProps;

    @Bean
    @Scope("prototype")
    public Car car(){
        Car c = new Car();
        c.setMake(carProps.getMake());
        c.setModel(carProps.getModel());
        c.setColour(carProps.getColour());
        c.setYear(carProps.getYear());
        return c;
    }
}
