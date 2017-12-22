package com.ly.configClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xn072816 on 2017/12/8.
 */
@RefreshScope
@RestController
public class EnvironmentController {

    @Autowired
    private Environment env;

    @RequestMapping(value = "/getEnv")
    public  String env(){
        String value = env.getProperty("from","isNull");
        String nulls = env.getProperty("nulls","default");
        return value + nulls;
    }
}
