package com.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
