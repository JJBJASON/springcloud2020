package com.zs.springcloud.service.impl;

import com.zs.springcloud.entities.Payment;
import com.zs.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import com.zs.springcloud.dao.PaymentDao;

import javax.annotation.Resource;

/**
 * @author jjb 2020/06/17 - 下午 8:09
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
