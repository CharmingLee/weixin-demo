package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/8/4 17:45
 */
@RestController
public class TestController {

    @GetMapping("/test1")
    public String index(){
        return "hello";
    }

    @GetMapping("/checkSignature")
    public String checkSignature(@RequestParam(required = false) String echostr) {
        return echostr;
    }


}
