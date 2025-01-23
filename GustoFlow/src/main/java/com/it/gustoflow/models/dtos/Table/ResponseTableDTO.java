package com.it.gustoflow.models.dtos.Table;

import com.it.gustoflow.models.dtos.CallRequest.EmbeddableCallRequestDTO;
import com.it.gustoflow.models.enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTableDTO {

    private Long id; // ID de la table
    private int number; // Numéro de la table
    private int secretCode; // Code secret de la table
    private TableStatus tableStatus; // Statut de la table
    private List<EmbeddableCallRequestDTO> calls; // Liste simplifiée des appels associés
}
