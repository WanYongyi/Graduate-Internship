package com.cn.employeesystem.service;

import com.cn.employeesystem.entity.Employee;

import java.util.List;

public interface EmployService {
        public List<Employee> findAllEmployee();
        public Employee findEmployeeById(String id);
        public boolean insertEmployee(Employee employee);
}

