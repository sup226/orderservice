package com.playdata.orderservice.product.repository;

import com.playdata.orderservice.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;

public interface ProductRepository
        extends JpaRepository<Product, Long> {
    // QueryDSL 의존성 라이브러리 추가, clean, compile java
//    @Query("SELECT p FROM Product p WHERE p.category LIKE '%?%'")
//    void findByCategoryPaging(ProductSearchDto dto, Pageable pageable);
//    @Query("SELECT p FROM Product p WHERE p.name LIKE '%?%'")
//    void findByProdNamePaging(ProductSearchDto dto, Pageable pageable);
}
