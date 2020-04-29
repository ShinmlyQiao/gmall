package com.atguigu.gmall.pms.feign;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.sms.api.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: Qiao
 * @Description
 * @Date Created in 14:17 2020/4/29
 * @Version 1.0
 */
@FeignClient("sms-service")
public interface GmallSmsClient extends GmallSmsApi {


}
