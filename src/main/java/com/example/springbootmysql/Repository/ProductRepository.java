package com.example.springbootmysql.Repository;

import com.example.springbootmysql.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
    Product findByName(String name);
}
