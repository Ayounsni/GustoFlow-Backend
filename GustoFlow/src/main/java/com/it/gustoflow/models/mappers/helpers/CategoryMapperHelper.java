package com.it.gustoflow.models.mappers.helpers;

import com.it.gustoflow.models.entities.Category;
import com.it.gustoflow.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperHelper {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category mapCategoryIdToCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }
}
