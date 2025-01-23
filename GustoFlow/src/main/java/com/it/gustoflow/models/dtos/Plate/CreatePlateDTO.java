package com.it.gustoflow.models.dtos.Plate;

import com.it.gustoflow.models.entities.Category;
import com.it.gustoflow.models.entities.Table;
import com.it.gustoflow.validation.annotations.Exists;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePlateDTO {

    @NotBlank
    private String name; // Nom du plat

    private String description; // Description du plat

    @NotNull
    private int price; // Prix du plat

    private boolean available = true; // Disponibilité du plat

    @NotNull
    @Exists(entity = Category.class, message = "Cette categorie n'existe pas.")
    private Long categoryId; // ID de la catégorie associée
}
