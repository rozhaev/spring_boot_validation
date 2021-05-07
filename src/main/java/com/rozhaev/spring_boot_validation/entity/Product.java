package com.rozhaev.spring_boot_validation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @NotEmpty(message = "Product name is required")
    private String name;

    @NotEmpty(message = "Product code is required")
    @Size(min = 13, max = 13, message = "Code must contains 13 characters")
    private String code;
}
