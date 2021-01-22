package com.zy.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer id;
    private String name;
    // 数据库名
    private String dbSource;

    public Dept(String name) {
        this.name = name;
    }

}
