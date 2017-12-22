package com.ly.ribbon.controller;

import com.ly.ribbon.service.DemoService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xn072816 on 2017/12/5.
 */
@RestController
public class RibbonController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/ribbon", method = RequestMethod.GET)
    public String send(HttpServletRequest request) {
        return demoService.holle();
    }
}
