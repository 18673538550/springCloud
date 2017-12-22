package com.ly.feign.service;

import com.ly.feign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xn072816 on 2017/12/11.
 */
@FeignClient(value = "dev-client",fallback = FeignServiceFallback.class)
public interface FeignService {


    @RequestMapping(value = "/holle" ,method = RequestMethod.GET)
    public String holleFeign();

    @RequestMapping(value = "/users" ,method = RequestMethod.GET)
    public String nameFein(User user);
}
