package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Integer> {
}
