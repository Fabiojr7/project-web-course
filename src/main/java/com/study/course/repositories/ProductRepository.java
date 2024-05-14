package com.study.course.repositories;

import com.study.course.entities.Category;
import com.study.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
