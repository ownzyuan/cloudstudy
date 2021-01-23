package com.zy.springcloud.dao;

import com.zy.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    List<Dept> select();

    int add(Dept dept);

    int update(Dept dept);
    
    int delete(Long id);

    List<Dept> query(Dept dept);

}
