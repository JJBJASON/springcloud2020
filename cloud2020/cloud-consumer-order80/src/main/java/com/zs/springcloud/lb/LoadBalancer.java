package com.zs.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author jjb 2020/06/20 - 上午 10:56
 */
public interface LoadBalancer{

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
