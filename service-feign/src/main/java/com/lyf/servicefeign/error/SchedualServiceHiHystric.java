package com.lyf.servicefeign.error;

import com.lyf.servicefeign.service.ServiceFeignService;
import org.springframework.stereotype.Component;

/**
 * @program: springcloudstudy->SchedualServiceHiHystric
 * @description: 熔断器
 * @author: lishijia
 * @create: 2019-09-23 16:09
 **/
@Component
public class SchedualServiceHiHystric implements ServiceFeignService {
    @Override
    public String sayHi(String name) {
        return "sorry "+name+", the server is down";
    }
}
