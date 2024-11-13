package com.playdata.orderservice.product.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Setter @Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductSearchDto {
    private String category;
    private String searchName;
}
