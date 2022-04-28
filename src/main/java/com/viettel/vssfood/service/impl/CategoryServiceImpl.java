package com.viettel.vssfood.service.impl;

import com.viettel.vssfood.entity.Category;
import com.viettel.vssfood.repository.CategoryRepository;
import com.viettel.vssfood.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Integer postCategory(Category category) {
        categoryRepository.save(category);
        return category.getId();
    }

}
