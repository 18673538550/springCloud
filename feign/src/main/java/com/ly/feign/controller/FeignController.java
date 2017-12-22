package com.ly.feign.controller;

import com.ly.feign.entity.User;
import com.ly.feign.service.FeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xn072816 on 2017/12/11.
 */
@RestController
public class FeignController {

    private static final Logger logger = LoggerFactory.getLogger(FeignController.class);

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/holleFeign" ,method = RequestMethod.GET)
    public String holleFeign(HttpServletRequest request){
        return  feignService.holleFeign();
    }


    @RequestMapping(value = "/nameFeign" ,method = RequestMethod.GET)
    public String nameFeign(HttpServletRequest request, User user){
        logger.info("feign user :" + user.getName());
        return  feignService.nameFein(user);
    }
}
