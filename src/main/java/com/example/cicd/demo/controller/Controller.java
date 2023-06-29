package com.example.cicd.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
public class Controller {

    @Autowired
    Function getBean;

    @GetMapping("/data")
    public ResponseEntity getData(){
        System.out.println(getBean.apply("Hello"));
        return ResponseEntity.ok("Hello");
    }

}
