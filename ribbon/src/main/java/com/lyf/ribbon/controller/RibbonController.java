package com.lyf.ribbon.controller;

import com.lyf.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloudstudy->RibbonController
 * @description: ribbon控制层
 * @author: lishijia
 * @create: 2019-09-23 14:57
 **/
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("sayHi")
    public String sayHi(@RequestParam(value = "name") String name){
        return ribbonService.hiService(name);
    }

}
