package com.example.demo.Repository;

import java.util.Optional;

import com.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  Optional<Category> findByCategory(String category);
}

