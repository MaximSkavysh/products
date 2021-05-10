package com.ecommerce.products.service.product;

import com.ecommerce.products.entity.Product;
import com.ecommerce.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ApplicationEventPublisher publisher;

    @Override
    public Flux<Product> getAllProducts() {
        return this.productRepository.findAll();
    }
}
