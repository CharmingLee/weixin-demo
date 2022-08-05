package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.WechatMsg;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/send_msg")
    public String sendMsg() throws WxErrorException {
        //1，配置
        WxMpInMemoryConfigStorage wxStorage = new WxMpInMemoryConfigStorage();
        wxStorage.setAppId("wx1c9f5d719c62699f");
        wxStorage.setSecret("064588e2e5db1ed6fd96bfa6729ba165");
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxStorage);
        //2,推送消息
        WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
                .toUser("ogpZx6PZCkLxr_2DGEOmdQq1dNp0")
                .templateId("iUN-aPi-fH2vA6xeqQoXVJXa-yumovFm0_eEl7BvzuM")
                .build();

        wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
        System.out.println("发送消息：" + templateMessage.toJson());
        return "ok";
    }

}
