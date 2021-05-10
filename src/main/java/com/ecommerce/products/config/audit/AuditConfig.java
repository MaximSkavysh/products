package com.ecommerce.products.config.audit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@Configuration
@EnableReactiveMongoAuditing
public class AuditConfig {
    @Bean
    public ReactiveAuditorAware<String> myAuditorProvider() {
        return new AuditorAwareImpl();
    }
}
