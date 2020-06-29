package com.zs.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jjb 2020/06/27 - 下午 3:15
 */
//@component 否则springboot的容器扫描不到
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK,ฅʕ•̫͡•ʔฅ";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut,ฅʕ•̫͡•ʔฅ";
    }
}
