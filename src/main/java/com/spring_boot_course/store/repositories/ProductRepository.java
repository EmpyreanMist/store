package com.spring_boot_course.store.repositories;

import com.spring_boot_course.store.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    //String
    List<Product> findByName(String name);
    List<Product> findByNameLike(String name);
    List<Product> findByNameNotLike(String name);
    List<Product> findByNameContaining(String name);
    List<Product> findByNameStartingWith(String name);
    List<Product> findByNameEndingWith(String name);
    List<Product> findByNameEndingWithIgnoreCase(String name);

    // Numbers
    List<Product> findByPrice(BigDecimal price);
    // select * from products where price ?
    List<Product> findByPriceGreaterThan(BigDecimal price);
    List<Product> findByPriceGreaterThanEqual(BigDecimal price);
    List<Product> findByPriceLessThanEqual(BigDecimal price);
    List<Product> findPriceBetween(BigDecimal min, BigDecimal max);

    // Null
    List<Product> findByDescriptionNull();
    List<Product> findByDescriptionNotNull();

    // Multiple conditions
    List<Product>findByDescriptionNullAndNameNull();

    // Sort (OrderBy)
    List<Product> findByNameOrderByPriceDesc(String name);

    // Limit (Top/First)
    List<Product> findTop6ByNameOrderByPrice(String name);
    List<Product> findFirst6ByNameLikeOrderByPrice(String name);

}
