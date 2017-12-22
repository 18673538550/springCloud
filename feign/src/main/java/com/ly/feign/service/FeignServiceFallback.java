package com.ly.feign.service;

import com.ly.feign.entity.User;

/**
 * Created by xn072816 on 2017/12/22.
 */
public class FeignServiceFallback implements FeignService {


    @Override
    public String holleFeign() {
        return "error";
    }

    @Override
    public String nameFein(User user) {
        return "error";
    }
}
