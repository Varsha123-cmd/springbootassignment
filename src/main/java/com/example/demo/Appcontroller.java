package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Appcontroller {
	@RequestMapping("/table")
    public String Table() {
       
        return "table";
}
	@RequestMapping("/bankservices")
    public String Services() {
       
        return "tabletwo";
}
}
