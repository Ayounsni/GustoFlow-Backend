package com.it.gustoflow.models.dtos.Table;

import com.it.gustoflow.models.enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTableDTO {
    private int number; // Numéro de la table
    private int secretCode; // Code secret de la table
    private TableStatus tableStatus;
}
