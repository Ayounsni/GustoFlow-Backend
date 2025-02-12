package com.it.gustoflow.models.dtos.Table;


import com.it.gustoflow.models.enums.TableStatus;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CodeSecretDTO {
    @Min(value = 1000, message = "Le code secret doit être au moins 1000.")
    @Max(value = 9999, message = "Le code secret doit être au maximum 9999.")
    private Integer secretCode; // Code secret de la table

}
