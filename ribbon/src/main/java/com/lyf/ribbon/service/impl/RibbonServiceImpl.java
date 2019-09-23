package com.lyf.ribbon.service.impl;

import com.lyf.ribbon.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloudstudy->RibbonServiceImpl
 * @description: ribbonservice实现类
 * @author: lishijia
 * @create: 2019-09-23 14:52
 **/
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;


    @Override
    @HystrixCommand(fallbackMethod = "errorHi")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?id="+name , String.class);
    }

    @Override
    public String errorHi(String name) {
        return "sorry "+name+", the server is down";
    }


}
