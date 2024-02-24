package org.hillel.spring.config;

import org.hillel.spring.model.mapper.OrderMapper;
import org.hillel.spring.model.mapper.OrderMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperTestConfig {
    @Bean
    public OrderMapper orderMapper() {
        return new OrderMapperImpl();
    }
}
