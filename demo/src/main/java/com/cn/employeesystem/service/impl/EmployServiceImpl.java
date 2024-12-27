package com.cn.employeesystem.service.impl;

import com.cn.employeesystem.entity.Employee;
import com.cn.employeesystem.mapper.EmployeeMapper;
import com.cn.employeesystem.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployServiceImpl implements EmployService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> List = employeeMapper.findAllEmployee();
        System.out.println(List);
        return List;
    }

    @Override
    public Employee findEmployeeById(String id) {
        return employeeMapper.findEmployeeById(id);
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }

}
