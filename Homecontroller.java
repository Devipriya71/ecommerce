package com.cts.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class Homecontroller {  
      
    @RequestMapping("/") 
    public String home() {  
        return "home";  
    }  
      
    @RequestMapping("/admin")  
    public String admin() {  
        return "admin";  
    }  
    @RequestMapping("/user")  
    public String login() {  
        return "login";  
    }  
}  

