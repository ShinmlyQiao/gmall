package com.atguigu.gmall.snote.listener;

import com.atguigu.gmall.snote.config.SmsProperties;
import com.atguigu.gmall.snote.myCode.Send;
import com.atguigu.gmall.snote.utils.SmsUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@EnableConfigurationProperties(SmsProperties.class)
public class SmsListener {

    @Autowired
    private SmsUtils smsUtils;

    @Autowired
    private Send send;

    @Autowired
    private SmsProperties smsProperties;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "gmall-note-queue", durable = "true"),
            exchange = @Exchange(value = "GMALL-NOTE-EXCHANGE",
                                 ignoreDeclarationExceptions = "true"),
            key = {"note.verifycode"}))
    public void listenSms(Map<String, String> msg) throws Exception {
        if (msg == null || msg.size() <= 0) {
            // 放弃处理
            return;
        }
        String phone = msg.get("phone");
        String code = msg.get("code");

        if (StringUtils.isBlank(phone) || StringUtils.isBlank(code)) {
            // 放弃处理
            return;
        }
        // 发送消息
//        SendSmsResponse resp = this.smsUtils.sendSms(phone, code,
//                smsProperties.getSignName(),
//                smsProperties.getVerifyCodeTemplate());
        this.send.sendCode(phone,code);

    }
}