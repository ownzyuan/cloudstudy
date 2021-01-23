package com.zy.springcloud.controller;

import com.zy.springcloud.pojo.Dept;
import com.zy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public Boolean add(@RequestBody Dept dept) {
        int result = deptService.add(dept);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @PostMapping("/update")
    public Boolean update(@RequestBody Dept dept) {
        int result = deptService.update(dept);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @PostMapping("/delete")
    public Boolean delete(@RequestBody Dept dept) {
        int result = deptService.delete(dept.getId());
        if (result > 0) {
            return true;
        }
        return false;
    }

    @GetMapping("/select")
    public List<Dept> select() {
        return deptService.select();
    }

    @GetMapping("/query")
    public List<Dept> query(Dept dept) {
        return deptService.query(dept);
    }

}
