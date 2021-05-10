package com.ecommerce.products.service.product;

import com.ecommerce.products.entity.Product;
import reactor.core.publisher.Flux;

public interface ProductService {

    Flux<Product> getAllProducts();
}
