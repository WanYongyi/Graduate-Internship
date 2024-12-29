package com.cn.employeesystem.entity;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 分页对象
public class Page<T> {
    private int totalCount;
    private int totalPage;
    private int currentPage;
    private int pageSize;
    private List<T> list;
}
