package com.lyf.servicefeign.controller;

import com.lyf.servicefeign.service.ServiceFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloudstudy->FeignController
 * @description: feign控制层
 * @author: lishijia
 * @create: 2019-09-23 15:33
 **/
@RestController
public class FeignController {

    @Autowired
    private ServiceFeignService serviceFeignService;

    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam(value = "name") String name){
        return serviceFeignService.sayHi(name);
    }

}
