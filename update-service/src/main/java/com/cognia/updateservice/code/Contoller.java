package com.cognia.updateservice.code;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Contoller {

    @Value("${update.version}")
    private String version;

    @GetMapping("/service")
    public String version(){
        return this.version;
    }
}
