package com.cognia.carservice.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Autowired
    private Car car;

    @GetMapping("/service")
    public @ResponseBody Car car(){
        return this.car;
    }
}
