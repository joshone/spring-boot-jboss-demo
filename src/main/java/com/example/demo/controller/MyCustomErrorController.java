package com.example.demo.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class MyCustomErrorController implements ErrorController {

	private static final String PATH = "/error";
    
    @GetMapping(value=PATH)
    public String error() {
        return "Error haven";
    }
 
    @Override
    public String getErrorPath() {
        return PATH;
    }

}
