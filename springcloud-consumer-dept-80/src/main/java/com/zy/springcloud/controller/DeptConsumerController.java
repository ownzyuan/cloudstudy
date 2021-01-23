package com.zy.springcloud.controller;

import com.zy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class DeptConsumerController {

    private final static String PROVIDER_PORT = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/select")
    public List<Dept> select(){
        return null;
    }

}
