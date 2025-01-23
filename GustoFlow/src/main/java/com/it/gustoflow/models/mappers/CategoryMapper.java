package com.it.gustoflow.models.mappers;

import com.it.gustoflow.models.dtos.Category.CreateCategoryDTO;
import com.it.gustoflow.models.dtos.Category.ResponseCategoryDTO;
import com.it.gustoflow.models.dtos.Category.UpdateCategoryDTO;
import com.it.gustoflow.models.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CategoryMapper extends GenericMapper<Category, CreateCategoryDTO, UpdateCategoryDTO,ResponseCategoryDTO> {

}
