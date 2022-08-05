package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.WechatMsg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/8/4 17:55
 */
@RestController
public class MessageController {

    @PostMapping("/receive_msg")
    public ApiResponse msg(@RequestBody WechatMsg msg) {
        System.out.println(msg);
        return ApiResponse.ok(0);
    }

}
