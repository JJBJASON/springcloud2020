package com.zs.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jjb 2020/06/28 - 上午 10:47
 */
@Configuration
public class GateWayConfig {

    //网关路由编码配置
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_zs",
                r ->r.path("/guonei")
                        .uri("http://news.baidu.com")).build();

        return routes.build();
    }
}
