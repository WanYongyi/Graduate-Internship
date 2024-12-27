package com.cn.employeesystem.controller;

import com.cn.employeesystem.entity.Employee;
import com.cn.employeesystem.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employees")
public class EmployController {

    @Autowired
    private EmployService employeeService;

    @GetMapping
    public List<Employee> findAllEmp() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("/findId/{id}")
    public Employee findEmpById(@PathVariable String id) {
        return employeeService.findEmployeeById(id);
    }

    @PostMapping("/addEmployee")
    public boolean addEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }
}
