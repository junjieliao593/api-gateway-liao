package com.liao.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("Service-A-2,add/, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return "From Service-A-2, Result is " + r;
    }
    
    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public String test(@RequestParam String param) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("Service-A-2,/test, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + param);
        return "From Service-A-2, Param is " + param;
    }

}