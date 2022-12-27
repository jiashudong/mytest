package com.jiasd.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class MyGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        MultiValueMap<String, String> token = exchange.getRequest().getQueryParams();
        //String token = exchange.getRequest().getQueryParams().getFirst("X-Request-Red");
        //String token = exchange.getRequest().getQueryParams().getFirst("token");
        /*String token=exchange.getRequest().getHeaders().getFirst("Authorization");

        if (token == null || token.isEmpty()) {
            //logger.info( "token is empty..." );
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }else {
            return chain.filter(exchange);
        }*/
        return chain.filter(exchange);

    }

    @Override
    public int getOrder() {
        return -100;
    }
}
