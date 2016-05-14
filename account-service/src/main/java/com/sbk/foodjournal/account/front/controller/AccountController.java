package com.sbk.foodjournal.account.front.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @RequestMapping(value = "/info")
    public HttpStatus info() {
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/account")
    public HttpStatus account() {
        return HttpStatus.OK;
    }


}
