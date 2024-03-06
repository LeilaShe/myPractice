package com.example.mymicroservicepractice.service;

import com.example.mymicroservicepractice.repository.EmployeeRepo;
import com.example.mymicroservicepractice.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mymicroservicepractice.entity.Employee;

import java.util.Optional;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    //@Autowired
    //private ModelMapper mapper;

        public Optional<Employee> getEmployeeById(int id){
        Optional<Employee> employee = employeeRepo.findById(id);
           return  employee;
        //return mapper.map(employee, EmployeeResponse.class);
    }
  /*  public EmployeeResponse getEmployeeById(Integer id){
        Optional<Employee> employee = employeeRepo.findById(id);
        return mapper.map(employee, EmployeeResponse.class);
    }*/
}
