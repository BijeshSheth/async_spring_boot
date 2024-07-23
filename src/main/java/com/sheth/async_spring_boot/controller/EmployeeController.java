package com.sheth.async_spring_boot.controller;

import com.sheth.async_spring_boot.model.Employee;
import com.sheth.async_spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/register")
    public String registration(@RequestBody Employee employee){
        service.register(employee);
        service.email();
        service.sms();
        return "Employee registered successfully";
    }
}
