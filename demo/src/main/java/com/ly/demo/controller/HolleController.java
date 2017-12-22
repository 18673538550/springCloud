package com.ly.demo.controller;

import com.ly.demo.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * Created by xn072816 on 2017/12/1.
 */
@RestController
@EnableEurekaClient
public class HolleController {
    private static final Log logger = LogFactory.getLog(HolleController.class);

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private CounterService counterService;

    @RequestMapping(value = "/holle",method = RequestMethod.GET)
    public String say(HttpServletRequest request) throws InterruptedException {
        counterService.increment("request.holle.count");
        ServiceInstance instance = client.getLocalServiceInstance();
        //超时设置
        int sleepTime =  new Random().nextInt(3000);
        logger.info("sleepTime:"+sleepTime);
        Thread.sleep(sleepTime);
        logger.info("locl:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "holle ";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String whoIsName(User user){
        return user.toString();
    }
}
