package com.zs.springcloud.service;

import com.zs.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author jjb 2020/06/17 - 下午 8:08
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
