package com.ly.ribbon.service.impl;

import com.ly.ribbon.service.DemoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xn072816 on 2017/12/12.
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "holleFallback" , commandKey = "holleKey")
    @Override
    public String holle() {
        long start = System.currentTimeMillis();
        String url = "http://demo-client/holle";
        String result = restTemplate.getForEntity(url,String.class).getBody();
        long end = System.currentTimeMillis() - start;
        logger.info("end:"+end);
        return result;
    }

    @Override
    public String holleFallback() {
        return "error";
    }
}
