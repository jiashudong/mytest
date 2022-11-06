
package com.jiasd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public MyGlobalFilter myGlobalFilter(){
        return new MyGlobalFilter();
    }
}

