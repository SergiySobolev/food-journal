package com.sbk.foodjournal.discovery.front;

import com.sbk.foodjournal.discovery.service.AccountService;
import com.sbk.foodjournal.discovery.service.Contributer;
import com.sbk.foodjournal.discovery.service.GitHubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GatewayController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private AccountService accountService;

    @Autowired
    private GitHubClient gitHubClient;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String account(){
        return accountService.account();
    }

    @RequestMapping(value = "/account-inst", method = RequestMethod.GET)
    public String accountInst(){
        return discoveryClient.getInstances("account").toString();
    }

    @RequestMapping(value = "/git", method = RequestMethod.GET)
    public List<Contributer> git(){
        return gitHubClient.contributors("SergiySobolev", "IlonaChat");
    }

}
