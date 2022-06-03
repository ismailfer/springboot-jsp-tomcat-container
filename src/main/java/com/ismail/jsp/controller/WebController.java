package com.ismail.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController
{
    
    @GetMapping({"/hello"})
    public String hello()
    {        
        return "{'message':'hello'}";
    }
    

    /*
    @RequestMapping(value = "/")
    public String home()
    {
        return "index.jsp";
    }
    */

}
