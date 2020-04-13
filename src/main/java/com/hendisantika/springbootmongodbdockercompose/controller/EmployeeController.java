package com.hendisantika.springbootmongodbdockercompose.controller;

import com.hendisantika.springbootmongodbdockercompose.model.Employee;
import com.hendisantika.springbootmongodbdockercompose.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/04/20
 * Time: 16.37
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee emp) {
        empRepository.save(emp);
        return "employee added successfully::" + emp.getId();
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }

}