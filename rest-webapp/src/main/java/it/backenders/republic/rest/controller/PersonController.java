package it.backenders.republic.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @RequestMapping("/hello")
    public String hello() throws Exception {
        return "hello";
    }


}