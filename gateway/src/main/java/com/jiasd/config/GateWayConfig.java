/*
package com.jiasd.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder){
        String str = "https://www.cnblogs.com/fulong133";
        return builder.routes()
                //id 表示被转发到uri地址的id名，
                .route("id",p -> p
                        //predicates，当访问的连接满足http://localhost:8091/fulong133   时即转发到str
                        .path("/fulong133")
                        .uri("https://www.cnblogs.com"))
                .build();
    }
}
*/
