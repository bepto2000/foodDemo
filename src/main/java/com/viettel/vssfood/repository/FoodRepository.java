package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

    Optional<Food> findByFoodName(String foodName);

    @Query(value = "SELECT *\n" +

            "FROM public.food \n" +
            "WHERE food_name ILIKE  %?1%",nativeQuery = true)
    Optional<Food> getResult(String foodName);
}
