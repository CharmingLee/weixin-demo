package com.tencent.wxcloudrun.model;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/8/4 18:22
 */
public class WechatMsg {
    private String action;
    private String ToUserName;
    private String FromUserName;
    private Long CreateTime;
    private String MsgType;
    private String Content;
    private Long MsgId;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public Long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Long getMsgId() {
        return MsgId;
    }

    public void setMsgId(Long msgId) {
        MsgId = msgId;
    }

    @Override
    public String toString() {
        return "WechatMsg{" +
                "action='" + action + '\'' +
                ", ToUserName='" + ToUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", CreateTime=" + CreateTime +
                ", MsgType='" + MsgType + '\'' +
                ", Content='" + Content + '\'' +
                ", MsgId=" + MsgId +
                '}';
    }
}
