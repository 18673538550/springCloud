package com.ly.configClient.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xn072816 on 2017/12/8.
 */
@RestController
public class configController {

    @Value("${from}")
    private String from;

    @RequestMapping("/getConfig")
    public String getConfig(HttpServletRequest request){
        return this.from;
    }
}
