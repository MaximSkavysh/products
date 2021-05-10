package com.ecommerce.products.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Category {
    private Long id;
    private String categoryIndex;
    private Map<String, String> categoryName;
}
