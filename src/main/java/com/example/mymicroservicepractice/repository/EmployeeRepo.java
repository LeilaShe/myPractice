package com.example.mymicroservicepractice.repository;

import com.example.mymicroservicepractice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}

