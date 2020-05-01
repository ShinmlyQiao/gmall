package com.atguigu.gmall.search.feign;

import com.atguigu.gmall.wms.api.GmallWmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: Qiao
 * @Description
 * @Date Created in 10:53 2020/5/1
 * @Version 1.0
 */
@FeignClient("wms-service")
public interface GmallWmsClient extends GmallWmsApi {
}
