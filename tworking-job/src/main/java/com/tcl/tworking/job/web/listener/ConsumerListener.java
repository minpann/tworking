package com.tcl.tworking.job.web.listener;

import com.alibaba.fastjson.JSON;
import com.tcl.tworking.common.vo.MessageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by panmin on 16-10-18.
 */
public class ConsumerListener implements MessageListener {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerListener.class);

    @Override
    public void onMessage(Message message) {
        try {
            TextMessage textMessage = (TextMessage) message;
            MessageInfo messageInfo = JSON.parseObject(textMessage.getText(), MessageInfo.class);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(messageInfo.getMsgId() + ":"+ format.format(new Date()) + ":" + messageInfo.getContent());
        }catch (Exception e) {
            logger.error("consumer queue listener error: ", e);
        }
    }
}
