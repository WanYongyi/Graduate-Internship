package com.cn.employeesystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee{
    private Integer id;
    private String name;
    private String gender;
    private Integer deptId;
    private LocalDateTime entryDate;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

//    // 无参构造方法
//    public Employee() {
//    }
//
//    // 有参构造方法
//    public Employee(Integer id, String name, String gender, Integer deptId, LocalDateTime createTime, LocalDateTime updateTime) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.deptId = deptId;
//        this.createTime = createTime;
//        this.updateTime = updateTime;
//    }
//
//    // Get，Set方法
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//                public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public Integer getDeptId() {
//        return deptId;
//    }
//
//    public void setDeptId(Integer deptId) {
//        this.deptId = deptId;
//    }
//
//    public LocalDateTime getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(LocalDateTime createTime) {
//        this.createTime = createTime;
//    }
//
//    public LocalDateTime getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(LocalDateTime updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", deptId=" + deptId +
//                ", createTime=" + createTime +
//                ", updateTime=" + updateTime +
//                '}';
//    }
}
