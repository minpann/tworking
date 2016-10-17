package com.tcl.tworking.biz.service.impl;

import org.apache.activemq.command.ActiveMQQueue;

/**
 * Created by panmin on 16-10-18.
 */
public interface SendMessageService {
    void sendMessage(ActiveMQQueue queue, String jmsMessage);
    void sendMessageToTworking();
}
