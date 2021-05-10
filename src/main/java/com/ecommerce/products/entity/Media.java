package com.ecommerce.products.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Media {
    private List<String> mediaUrls;
    private String brandUrl;
}
