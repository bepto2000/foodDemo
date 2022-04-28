package com.viettel.vssfood.service.impl;

import com.viettel.vssfood.dto.FoodDto;
import com.viettel.vssfood.entity.Category;
import com.viettel.vssfood.entity.Food;

import com.viettel.vssfood.mapper.FoodMapper;
import com.viettel.vssfood.repository.CategoryRepository;
import com.viettel.vssfood.repository.FoodRepository;
import com.viettel.vssfood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodMapper foodMapper;
    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public FoodDto findByFoodName(String foodName) {
        Optional<Food> food = foodRepository.findByFoodName(foodName.trim().replaceAll("\\s+", " "));
//     trim().replaceAll("[ ]{2,}", " ")
        if (!food.isPresent()) {
            return null;
        }

        Optional<Category> category = categoryRepository.findById(food.get().getCategoryId());

        return category.map(value -> foodMapper.toDto(food.get(), value.getCategoryName())).orElse(null);
    }



    @Override
    public Optional<Food> getResult(String foodName) {
        return foodRepository.getResult(foodName);
    }


}



