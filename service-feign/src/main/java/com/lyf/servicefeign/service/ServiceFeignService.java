package com.lyf.servicefeign.service;

import com.lyf.servicefeign.error.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi" , fallback = SchedualServiceHiHystric.class)
public interface ServiceFeignService {

    @RequestMapping(value = "hi" , method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "id") String name);

}
