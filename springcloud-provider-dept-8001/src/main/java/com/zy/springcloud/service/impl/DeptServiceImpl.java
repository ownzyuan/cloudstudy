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

    public Boolean add(Dept dept) {
        int result = deptDao.add(dept);
        if (result > 0) {
            return true;
        }
        return false;
    }

    public Boolean update(Dept dept) {
        int result = deptDao.update(dept);
        if (result > 0) {
            return true;
        }
        return false;
    }

    public Boolean delete(Long id) {
        int result = deptDao.delete(id);
        if (result > 0) {
            return true;
        }
        return false;
    }

    public List<Dept> query(Dept dept) {
        return deptDao.query(dept);
    }
}
