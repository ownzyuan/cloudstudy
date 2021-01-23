package com.zy.springcloud.service.impl;

import com.zy.springcloud.dao.DeptDao;
import com.zy.springcloud.pojo.Dept;
import com.zy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public List<Dept> select() {
        return deptDao.select();
    }

    public int add(Dept dept) {
        return deptDao.add(dept);
    }

    public int update(Dept dept) {
        return deptDao.update(dept);
    }

    public int delete(Long id) {
        return deptDao.delete(id);
    }

    public List<Dept> query(Dept dept) {
        return deptDao.query(dept);
    }
}
