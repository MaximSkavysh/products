package com.ecommerce.products.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Model {
    @Field("modelSku")
    private String modelSku;
    @Field("name")
    private Map<String, String> name;
    @Field("categories")
    private List<Category> categories;

    public Model(String modelSku) {
        this.modelSku = modelSku;
        this.name = Map.of("en", "en name",
                "ru", "ru name");
    }
}
