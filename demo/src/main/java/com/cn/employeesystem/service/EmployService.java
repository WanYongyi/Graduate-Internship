package com.cn.employeesystem.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cn.employeesystem.entity.Employee;
//import com.cn.employeesystem.entity.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployService {
        public List<Employee> findAllEmployee();
        // 根据ID查询员工信息
        public Employee findEmployeeById(String id);
        // 添加员工
        public boolean insertEmployee(Employee employee);
        // 更新员工信息
        public boolean updateEmployee(Employee employee);
        // 删除员工
        public boolean deleteEmployee(String id);
        public Page<Employee> findEmployeesByPage(int currentPage, int pageSize);
        public boolean deleteItemsByIds(@Param("ids") List<Integer> ids);
        // 根据姓名模糊查询员工信息
        public Page<Employee> searchEmployeesByName(String name, int currentPage, int pageSize);

}

