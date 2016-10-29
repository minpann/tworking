package com.tcl.tworking.common.vo;

import java.io.Serializable;

/**
 * Created by panmin on 16-10-29.
 */
public class MessageInfo implements Serializable {
    private Long msgId;
    private String content;

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MessageInfo{" +
                "msgId=" + msgId +
                ", content='" + content + '\'' +
                '}';
    }
}
