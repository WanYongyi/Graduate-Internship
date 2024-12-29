package com.cn.employeesystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cn.employeesystem.entity.Employee;
//import com.cn.employeesystem.entity.Page;
import com.cn.employeesystem.mapper.EmployeeMapper;
import com.cn.employeesystem.service.EmployService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class EmployServiceImpl implements EmployService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllEmployee() {
//        List<Employee> List = employeeMapper.findAllEmployee();
        List<Employee> List = employeeMapper.selectList(null);
        System.out.println(List);
        return List;
    }

    @Override
    public Employee findEmployeeById(String id) {
//        return employeeMapper.findEmployeeById(id);
        return employeeMapper.selectById(id);
    }

    @Override
    public boolean insertEmployee(Employee employee) {
//        return employeeMapper.insertEmployee(employee)
        return employeeMapper.insert(employee) > 0;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
//        return employeeMapper.updateEmployee(employee);
        return employeeMapper.updateById(employee) > 0;
    }

    @Override
    public boolean deleteEmployee(String id) {
//        return employeeMapper.deleteEmployee(id);
        return employeeMapper.deleteById(id) > 0;
    }

    @Override
    public Page<Employee> findEmployeesByPage(int currentPage, int pageSize) {
        // 具体业务逻辑
        // 1.获取总记录数
        int totalCount = employeeMapper.getTotalCount();
        // 2.计算总页数
        int totalPage = ((totalCount % pageSize) == 0) ? (totalCount / pageSize) : ((totalCount / pageSize) + 1);
        // 3.查询的起始位置
        int offset = (currentPage - 1) * pageSize;
        Page<Employee> page = new Page<>(); // 创建分页对象
        page.setCurrent(currentPage); // 当前页
        page.setTotal(totalCount); // 总记录数
        page.setSize(pageSize); // 每页显示记录数
        page.setRecords(employeeMapper.findEmployeesByPage(offset, pageSize)); // 每页显示的数据
        page.setTotal(totalPage); // 总页数
//        page.setCurrentPage(currentPage);
//        page.setTotalCount(totalCount);
//        page.setPageSize(pageSize);
//        page.setList(employeeMapper.findEmployeesByPage(offset, pageSize));
//        page.setTotalPage(totalPage);

        return page;
    }

    @Override
    public boolean deleteItemsByIds(List<Integer> ids) {
//        return employeeMapper.deleteItemsByIds(ids);
        return employeeMapper.deleteBatchIds(ids) > 0;
    }

    @Override
    public Page<Employee> searchEmployeesByName(String name, int currentPage, int pageSize) {
        Page<Employee> page = new Page<>();
        // QueryWrapper
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        // name like '%张%'
        queryWrapper.like("name", name);
        page = employeeMapper.selectPage(page, queryWrapper);
        page.setTotal(page.getRecords().size());
        return page;
    }


}
