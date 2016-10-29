package com.tcl.tworking.biz.service.message.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.tcl.tworking.biz.service.message.SendMessageService;
import com.tcl.tworking.common.vo.MessageInfo;

/**
 * Created by panmin on 16-10-18.
 */
public class SendMessageServiceImpl implements SendMessageService {
    private static final Logger logger = LoggerFactory.getLogger(SendMessageServiceImpl.class);

    private JmsTemplate jmsTemplate;
    private ActiveMQQueue tworkingDest;


    private void seedMessage(ActiveMQQueue queue, final String jmsMessage,long receiveTimeout){

        logger.debug("sendMessage:queuName={},jmsMessage={}", queue.getPhysicalName(), jmsMessage);

        try {
            jmsTemplate.setReceiveTimeout(receiveTimeout);  //设置超时时间
            jmsTemplate.send(queue, new MessageCreator() {
                @Override
                public Message createMessage(Session session) throws JMSException {
                    return session.createTextMessage(jmsMessage);
                }
            });
        } catch (Exception e) {
            logger.error("send message error", e);
        }
    }

    @Override
    public void sendMessage(ActiveMQQueue queue, String jmsMessage) {
        seedMessage(queue,jmsMessage,JmsTemplate.RECEIVE_TIMEOUT_INDEFINITE_WAIT);
    }

    @Transactional
    @Override
    public void sendMessageToTworking() {
        //create message information
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.setMsgId(10001l);
        messageInfo.setContent("sent a message to tworking!");

        String jsonMessage = JSON.toJSONString(messageInfo);
        logger.debug("开始向tworking消息队列发送消息:{}",jsonMessage);
        sendMessage(tworkingDest,jsonMessage);
    }


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
}
