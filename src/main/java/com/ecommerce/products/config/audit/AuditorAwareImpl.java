package com.ecommerce.products.config.audit;

import org.springframework.data.domain.ReactiveAuditorAware;
import reactor.core.publisher.Mono;

public class AuditorAwareImpl implements ReactiveAuditorAware<String> {
    @Override
    public Mono<String> getCurrentAuditor() {
        return Mono.just("Mike");
    }
}
