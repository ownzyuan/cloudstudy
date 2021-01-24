package com.zy.springcloud.controller;

import com.zy.springcloud.pojo.Dept;
import com.zy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider/dept/")
public class DeptController {

    @Autowired
    private DeptService deptService;

    // 获取一些配置的信息，得到具体的微服务
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("add")
    public Boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @PostMapping("update")
    public Boolean update(@RequestBody Dept dept) {
        return deptService.update(dept);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody Dept dept) {
        return deptService.delete(dept.getId());
    }

    @GetMapping("select")
    public List<Dept> select() {
        return deptService.select();
    }

    @PostMapping("query")
    public List<Dept> query(@RequestBody Dept dept) {
        return deptService.query(dept);
    }

    // 注册进来的微服务，获取一些消息(现在只有一个服务)
    @GetMapping("discovery")
    public Object discovery() {
        // 获取微服务列表清单
        List<String> services = discoveryClient.getServices();
        services.forEach(service -> System.out.println(service));
        // 输出：springcloud-provider-dept

        // 获取一个具体的微服务信息，通过具体的微服务id、applicationName
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId()
            );
        }
        // 输出：Legand-game	8001	http://Legand-game:8001	SPRINGCLOUD-PROVIDER-DEPT

        return this.discoveryClient;
        // return的JSON：
        //  {"discoveryClients":[{"services":["springcloud-provider-dept"],"order":0},
        //  {"services":[],"order":0}],"services":["springcloud-provider-dept"],"order":0}
    }

}
