package com.it.gustoflow.models.dtos.CallRequest;

import com.it.gustoflow.models.entities.Table;
import com.it.gustoflow.models.enums.CallRequestStatus;
import com.it.gustoflow.models.enums.RequestType;
import com.it.gustoflow.validation.annotations.Exists;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCallRequestDTO {

    @NotNull
    private RequestType requestType; // Type de demande (HELP, ORDER, etc.)

    @NotNull
    @Exists(entity = Table.class, message = "Cete table n'existe pas.")
    private Long tableId; // ID de la table associée

    private CallRequestStatus status = CallRequestStatus.PENDING;
}
