package com.rozhaev.spring_boot_validation.entity;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    @NotNull(message = "Seller field is required")
    @Size(min = 9, max = 9, message = "Seller must contains 9 characters")
    private String seller;

    @NotNull(message = "Customer field is required")
    @Size(min = 9, max = 9, message = "Customer must contains 9 characters")
    private String customer;

    @NotNull(message = "Product list is required")
    private @Valid List<Product> products;
}
