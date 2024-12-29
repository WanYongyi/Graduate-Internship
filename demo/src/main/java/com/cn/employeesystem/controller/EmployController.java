package com.cn.employeesystem.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cn.employeesystem.entity.Employee;
//import com.cn.employeesystem.entity.Page;
import com.cn.employeesystem.entity.Result;
import com.cn.employeesystem.service.EmployService;
import org.apache.logging.log4j.message.ReusableMessage;
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
    public Result findAllEmp() {
        List<Employee> employees =  employeeService.findAllEmployee();
        if(employees != null) {
            return Result.success(employees);
        } else {
            return Result.error("失败！");
        }
    }

    @GetMapping("/findId/{id}")
    public Result findEmpById(@PathVariable String id) {
        Employee emp = employeeService.findEmployeeById(id);
        if(emp != null) {
            return Result.success(emp);
        } else {
            return Result.error("失败！");
        }
    }

    @PostMapping("/add")
    public Result addEmployee(@RequestBody Employee employee) {
        boolean flag = employeeService.insertEmployee(employee);
        if(flag) {
            return Result.success();
        } else {
            return Result.error("失败!");
        }
    }

    @PutMapping("/update")
    public Result updateEmployee(@RequestBody Employee employee) {
        boolean flag = employeeService.updateEmployee(employee);
        if(flag) {
            return Result.success();
        } else {
            return Result.error("失败!");
        }
    }

    @DeleteMapping("/delete{id}")
    public Result deleteEmployee(@PathVariable String id) {
        boolean flag = employeeService.deleteEmployee(id);
        if(flag) {
            return Result.success();
        } else {
            return Result.error("失败!");
        }
    }

    @GetMapping("/page")
    public Result getEmployeesByPage(@RequestParam int currentPage, @RequestParam int pageSize) {
//        System.out.println(currentPage);
//        System.out.println(pageSize);
        Page<Employee> page = employeeService.findEmployeesByPage(currentPage, pageSize);
        if(page != null) {
            return Result.success();
        } else {
            return Result.error("失败!");
        }
    }

    @DeleteMapping("/delByIds")
    public Result deleteItemsByIds(@RequestBody List<Integer> ids) {
        boolean flag = employeeService.deleteItemsByIds(ids);
        if(flag) {
            return Result.success();
        } else {
            return Result.error("失败！");
        }
    }

    @GetMapping("/search")
    public Result searchEmployeesByName(@RequestParam String name, @RequestParam int currentPage, @RequestParam int pageSize) {
        Page<Employee> page = employeeService.searchEmployeesByName(name, currentPage, pageSize);
        if(page != null) {
            return Result.success();
        } else {
            return Result.error("失败!");
        }
    }
}
