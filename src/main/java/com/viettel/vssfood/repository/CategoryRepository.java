package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.Category;
import com.viettel.vssfood.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
//@Query("select f.*, c.category_name from food f join category c on f.category_id = c.id where c.id = 1")
//Optional<Category> findCategoryByCategoryName(String categoryName);

}
