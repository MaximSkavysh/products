package com.ecommerce.products.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Attributes {
    private Long id;
    private String attributeIndex;
    private Map<String, String> attributeName;
    private Boolean required;
}
