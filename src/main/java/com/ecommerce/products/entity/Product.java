package com.ecommerce.products.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

@Getter
@Setter
@Document(collection = "products")
@NoArgsConstructor
public class Product extends Audit {
    @Id
    @EqualsAndHashCode.Exclude
    private String id;

    @Indexed(unique = true)
    @Field("sku")
    private String sku;

    @Field("name")
    private Map<String, String> name;

    @Field("description")
    private Map<String, String> description;

    @Field("summary")
    private Map<String, String> summary;

    @Field("model")
    private Model model;

    @Field("media")
    private Media media;

    public Product(String s) {
        this.sku = s;
        this.name = Map.of("en", "en name",
                "ru", "ru name");
        this.model = new Model("modelIndex1");
    }
}
