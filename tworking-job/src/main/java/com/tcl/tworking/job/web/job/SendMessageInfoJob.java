package com.tcl.tworking.job.web.job;

import com.tcl.tworking.biz.service.message.SendMessageService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by panmin on 16-10-29.
 */
@Component("SendMessageInfoJob")
public class SendMessageInfoJob {
    @Resource
    private SendMessageService sendMessageService;

    public void sendMessageInfo() {
        sendMessageService.sendMessageToTworking();
    }

}
