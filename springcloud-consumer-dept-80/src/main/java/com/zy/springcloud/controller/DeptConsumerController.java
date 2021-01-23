package com.zy.springcloud.controller;

import com.zy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/dept/")
public class DeptConsumerController {

    private final static String PROVIDER_PORT = "http://localhost:8001/provider/dept/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("select")
    public List<Dept> select(){
        return restTemplate.getForObject(PROVIDER_PORT + "select", List.class);
    }

    @PostMapping("add")
    public Boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(PROVIDER_PORT + "add", dept, Boolean.class);
    }

    @PostMapping("update")
    public Boolean update(@RequestBody Dept dept) {
        return restTemplate.postForObject(PROVIDER_PORT + "update", dept, Boolean.class);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody Dept dept) {
        return restTemplate.postForObject(PROVIDER_PORT + "delete", dept, Boolean.class);
    }

    @PostMapping("query")
    public List<Dept> query(@RequestBody Dept dept) {
        return restTemplate.postForObject(PROVIDER_PORT + "query", dept, List.class);
    }

}
