package com.ecommerce.products.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Characteristic {
    private Long id;
    private String characteristicIndex;
    private Map<String, String> characteristicName;
    private CharacteristicType characteristicType;
    private List<Attributes> attributes;
}
