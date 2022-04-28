package com.viettel.vssfood.mapper;

import com.viettel.vssfood.dto.FoodDto;
import com.viettel.vssfood.entity.Food;
import org.springframework.stereotype.Component;

@Component
public class FoodMapper {

    public FoodDto toDto(Food foodEntity, String categoryName) {
        FoodDto dto = new FoodDto();
        dto.setFoodName(foodEntity.getFoodName());
        dto.setAverageVote(foodEntity.getAverageVote());
        dto.setDescription(foodEntity.getDescription());
        dto.setStatus(foodEntity.getStatus());
        dto.setPrice(foodEntity.getPrice());
        dto.setCategoryName(categoryName);
        return dto;
    }

    public Food toEntity(FoodDto foodDto, int categoryID) {
        Food foods = new Food();
        foods.setFoodName(foodDto.getFoodName());
        foods.setAverageVote(foodDto.getAverageVote());
        foods.setDescription(foodDto.getDescription());
        foods.setStatus(foodDto.getStatus());
        foods.setPrice(foodDto.getPrice());
        foods.setCategoryId(categoryID);
        return foods;

    }


}
