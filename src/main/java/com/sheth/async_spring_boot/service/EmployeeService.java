package com.sheth.async_spring_boot.service;

import com.sheth.async_spring_boot.model.Employee;
import com.sheth.async_spring_boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public void register(Employee emp){
        repository.save(emp);
    }

    @Async
    public void email(){
        try {
            Thread.sleep(5000);
            System.out.println("email sent");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Async
    public void sms(){
        try {
            Thread.sleep(5000);
            System.out.println("sms sent");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
