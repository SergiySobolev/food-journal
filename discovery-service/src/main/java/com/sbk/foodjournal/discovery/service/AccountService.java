package com.sbk.foodjournal.discovery.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("account")
public interface AccountService {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    String info();

   // @HystrixProperty(name = "hystrix.command.default.execution.timeout.enabled", value = "false")
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    String account();
}
