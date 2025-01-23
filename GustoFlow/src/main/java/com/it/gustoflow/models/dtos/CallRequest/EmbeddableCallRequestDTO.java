package com.it.gustoflow.models.dtos.CallRequest;

import com.it.gustoflow.models.dtos.Table.EmbeddableTableDTO;
import com.it.gustoflow.models.enums.CallRequestStatus;
import com.it.gustoflow.models.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmbeddableCallRequestDTO {

    private Long id; // ID de la demande

    private LocalDateTime timestamp; // Horodatage de la demande

    private RequestType requestType; // Type de demande (HELP, ORDER, etc.)

    private CallRequestStatus status; // Statut de la demande (PENDING, RESOLVED)

    private EmbeddableTableDTO table;
}
