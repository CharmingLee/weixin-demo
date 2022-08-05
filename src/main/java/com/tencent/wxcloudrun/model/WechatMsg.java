package com.tencent.wxcloudrun.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/8/4 18:22
 */
public class WechatMsg {
    private String action;
    @JsonProperty(value = "ToUserName")
    private String toUserName;
    @JsonProperty(value = "FromUserName")
    private String fromUserName;
    @JsonProperty(value = "CreateTime")
    private Long createTime;
    @JsonProperty(value = "MsgType")
    private String msgType;
    @JsonProperty(value = "Content")
    private String content;
    @JsonProperty(value = "MsgId")
    private Long msgId;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    @Override
    public String toString() {
        return "WechatMsg{" +
                "action='" + action + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType='" + msgType + '\'' +
                ", content='" + content + '\'' +
                ", msgId=" + msgId +
                '}';
    }
}
