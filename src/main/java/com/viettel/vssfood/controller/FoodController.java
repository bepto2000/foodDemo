package com.viettel.vssfood.controller;

import com.viettel.vssfood.dto.FoodDto;
import com.viettel.vssfood.service.FoodService;
import com.viettel.vssfood.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/search/food")
    ResponseEntity<JsonResponse> findByFoodName(@RequestParam(name = "food-name") String foodName) {
        FoodDto foundFood = foodService.findByFoodName(foodName);
        if (foundFood == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new JsonResponse("Food not found!"));

        }
        return ResponseEntity.ok(new JsonResponse("Query Food Successfully!", foundFood));
    }

    @GetMapping("/search/foods")
    ResponseEntity<JsonResponse> getResult(@RequestParam(name = "food-names") String foodName) {
        FoodDto foundFood = foodService.findByFoodName(foodName);
        if (foundFood == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new JsonResponse("Food not found!"));

        }
        return ResponseEntity.ok(new JsonResponse("Query Food Successfully!", foundFood));


    }
}
