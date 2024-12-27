package com.cn.employeesystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor  // 生成无参构造函数
@AllArgsConstructor // 生成全参数构造函数
@Data // 生成 Get set 方法

public class dept { // 部门类
    private Integer deptId; // 部门ID
    private String deptName; // 部门名称
    private LocalDateTime deptCreateDate;   // 创建时间
    private LocalDateTime deptUpdateDate;   // 更新时间
}
