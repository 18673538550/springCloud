package com.ly.feign.entity;

import java.io.Serializable;

/**
 * Created by xn072816 on 2017/12/11.
 */
public class User implements Serializable{

    public User(){}

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
