package com.example.mymicroservicepractice.configuration;

import com.example.mymicroservicepractice.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class EmployeeConfig {

    @Bean
    public EmployeeService employeeBean(){
        return new EmployeeService();
    }

    @Bean
    public ModelMapper modelMapperBean(){
        return new ModelMapper();
    }
}
