package com.example.mymicroservicepractice.controller;

import com.example.mymicroservicepractice.entity.Employee;
import com.example.mymicroservicepractice.repository.EmployeeRepo;
import com.example.mymicroservicepractice.response.EmployeeResponse;
import com.example.mymicroservicepractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<Optional> getEmployeeById(@PathVariable("id") int id) {
         Optional<Employee> employee = employeeService.getEmployeeById(id);
         return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
/*    @GetMapping("/employees/{id}")
    private ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable Integer id){
        EmployeeResponse employee = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }*/

}
