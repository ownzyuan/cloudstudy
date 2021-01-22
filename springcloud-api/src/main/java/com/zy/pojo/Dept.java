package com.zy.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer id;
    private String name;
    // 数据库名
    private String dbSource;

    public Dept(String name) {
        this.name = name;
    }

}
