package com.dongtian.redis_module.controller;

import com.dongtian.redis_module.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    RedisUtil redisUtil;

    @GetMapping("/setValue")
    public boolean setRedis(String key,String value){
        boolean res = redisUtil.set(key,value);
        return res;
    }

    @GetMapping("/getValue")
    public String getRedis(String key){
        String value = (String) redisUtil.get(key);
        return value;
    }
}
