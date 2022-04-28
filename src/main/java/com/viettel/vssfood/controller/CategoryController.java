package com.viettel.vssfood.controller;

import com.viettel.vssfood.entity.Category;
import com.viettel.vssfood.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/category")
    public Integer postCategory(@RequestBody Category category) {
        return categoryService.postCategory(category);
    }
}
