package com.sbk.foodjournal.discovery.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="git", url = "https://api.github.com")
public interface GitHubClient {

    //e.g. http://localhost:10080/andrefaria/spring-cloud-feign-example
   // @HystrixProperty(name = "hystrix.command.default.execution.timeout.enabled", value = "false")
    @RequestMapping(method = RequestMethod.GET, value = "/repos/{owner}/{repo}/contributors")
    List<Contributer> contributors(@RequestParam("owner") String owner, @RequestParam("repo") String repo);

}

