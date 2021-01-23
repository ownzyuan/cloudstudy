package com.zy.springcloud.service;

import com.zy.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> select();

    int add(Dept dept);

    int update(Dept dept);
    
    int delete(Long id);

    List<Dept> query(Dept dept);

}
