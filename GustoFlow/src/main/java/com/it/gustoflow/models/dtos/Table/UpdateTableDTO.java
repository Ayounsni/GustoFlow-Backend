package com.it.gustoflow.models.dtos.Table;

import com.it.gustoflow.models.enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTableDTO {
    private Integer number; // Numéro de la table
    private Integer secretCode;
    private TableStatus tableStatus;
}
