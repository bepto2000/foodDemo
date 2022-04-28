package com.viettel.vssfood.service;

import com.viettel.vssfood.dto.FoodDto;
import com.viettel.vssfood.entity.Food;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FoodService {

    FoodDto findByFoodName(String foodName);
    Optional<Food> getResult(String foodName);



}
