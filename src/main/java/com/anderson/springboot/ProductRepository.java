package com.anderson.springboot;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anderson.springboot.models.ProductModel;

@Repository
public interface ProductRepository  extends JpaRepository<ProductModel, UUID>{
	

}
