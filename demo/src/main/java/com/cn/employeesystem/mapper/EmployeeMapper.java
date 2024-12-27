package com.cn.employeesystem.mapper;

import com.cn.employeesystem.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import com.cn.employeesystem.entity.Employee;
@Mapper//接口
public interface EmployeeMapper {
    // 查询所有员工信息
    public List<Employee> findAllEmployee();
    // 根据员工ID查询员工信息
    public Employee findEmployeeById(String id);
    //添加员工
    public boolean insertEmployee(Employee employee);
}
