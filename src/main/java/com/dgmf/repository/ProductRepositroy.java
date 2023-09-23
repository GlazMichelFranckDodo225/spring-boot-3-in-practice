package com.dgmf.repository;

import com.dgmf.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositroy extends JpaRepository<Product, Long> {
}
