package com.it.gustoflow.models.dtos.Category;

import com.it.gustoflow.models.entities.Category;
import com.it.gustoflow.validation.annotations.Unique;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCategoryDTO {

    @NotBlank
    @Unique(entity = Category.class, field = "name")
    private String name;
}
