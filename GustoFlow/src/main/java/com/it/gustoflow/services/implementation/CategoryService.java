package com.it.gustoflow.services.implementation;

import com.it.gustoflow.models.dtos.Category.CreateCategoryDTO;
import com.it.gustoflow.models.dtos.Category.ResponseCategoryDTO;
import com.it.gustoflow.models.dtos.Category.UpdateCategoryDTO;
import com.it.gustoflow.models.entities.Category;
import com.it.gustoflow.models.mappers.CategoryMapper;
import com.it.gustoflow.repository.CategoryRepository;
import com.it.gustoflow.services.interfaces.ICategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends GenericService<Category,CreateCategoryDTO,UpdateCategoryDTO,ResponseCategoryDTO> implements ICategoryService {

    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        super(categoryRepository, categoryMapper);
    }

}
