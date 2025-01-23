package com.it.gustoflow.services.interfaces;

import com.it.gustoflow.models.dtos.Category.CreateCategoryDTO;
import com.it.gustoflow.models.dtos.Category.ResponseCategoryDTO;
import com.it.gustoflow.models.dtos.Category.UpdateCategoryDTO;

public interface ICategoryService extends IGenericService<CreateCategoryDTO,UpdateCategoryDTO,ResponseCategoryDTO> {

}
