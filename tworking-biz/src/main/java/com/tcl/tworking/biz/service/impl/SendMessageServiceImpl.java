package com.tcl.tworking.biz.service.impl;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by panmin on 16-10-18.
 */
@Service
public class SendMessageServiceImpl implements SendMessageService{
    private JmsTemplate jmsTemplate;
    private ActiveMQQueue tworkingDest;

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public ActiveMQQueue getTworkingDest() {
        return tworkingDest;
    }

    public void setTworkingDest(ActiveMQQueue tworkingDest) {
        this.tworkingDest = tworkingDest;
    }

    @Override
    public void sendMessage(ActiveMQQueue queue, String jmsMessage) {

    }

    @Override
    public void sendMessageToTworking() {

    }
}
