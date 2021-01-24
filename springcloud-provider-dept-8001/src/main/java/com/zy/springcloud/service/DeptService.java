package com.zy.springcloud.service;

import com.zy.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> select();

    Boolean add(Dept dept);

    Boolean update(Dept dept);
    
    Boolean delete(Long id);

    List<Dept> query(Dept dept);

}
