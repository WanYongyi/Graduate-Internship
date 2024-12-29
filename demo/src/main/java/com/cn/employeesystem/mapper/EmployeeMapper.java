package com.cn.employeesystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cn.employeesystem.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper//接口
public interface EmployeeMapper extends BaseMapper<Employee> {
//    // 查询所有员工信息方法
//    public List<Employee> findAllEmployee();
//    // 根据员工ID查询员工信息方法
//    public Employee findEmployeeById(String id);
//    // 添加员工信息方法
//    public boolean insertEmployee(Employee employee);
//    // 更新员工信息方法
//    public boolean updateEmployee(Employee employee);
//    // 删除员工方法
//    public boolean deleteEmployee(String id);
    // 查询总记录数
    public int getTotalCount();
    // 根据分页查询员工信息
    public List<Employee> findEmployeesByPage(@Param("offset") int offset, @Param("pageSize") int pageSize);
    // 批量删除员工信息
    public boolean deleteItemsByIds(@Param("ids") List<Integer> ids);
}
