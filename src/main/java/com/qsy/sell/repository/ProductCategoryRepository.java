package com.qsy.sell.repository;

import com.qsy.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ProductCategoryRepository implements JpaRepository<ProductCategory,Integer> {
}
