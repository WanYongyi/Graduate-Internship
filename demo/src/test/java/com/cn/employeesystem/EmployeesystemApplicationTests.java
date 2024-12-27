package com.cn.employeesystem;

import com.cn.employeesystem.entity.Employee;
import com.cn.employeesystem.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmployeesystemApplicationTests {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void testFindAllEmployee() {
        List<Employee> list = employeeMapper.findAllEmployee();
        System.out.println(list);
    }
}
