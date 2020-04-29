package com.atguigu.gmall.sms.api;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.sms.vo.SkuSaleVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: Qiao
 * @Description
 * @Date Created in 14:37 2020/4/29
 * @Version 1.0
 */
public interface GmallSmsApi {
    @PostMapping("sms/skubounds/sku/sale/save")
    public Resp<Object> saveSale(@RequestBody SkuSaleVO skuSaleVO);
}
