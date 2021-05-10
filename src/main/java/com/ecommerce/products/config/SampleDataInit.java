package com.ecommerce.products.config;

import com.ecommerce.products.entity.Product;
import com.ecommerce.products.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Log4j2
@Component
public class SampleDataInit implements ApplicationListener<ApplicationReadyEvent> {

    private final ProductRepository repository;

    public SampleDataInit(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        repository
                .deleteAll()
                .thenMany(
                        Flux
                                .just("A", "B", "C", "D")
                                .map(name -> new Product(name + "@email.com"))
                                .flatMap(repository::save)
                )
                .thenMany(repository.findAll())
                .subscribe(profile -> log.info("saving " + profile.toString()));
    }
}
