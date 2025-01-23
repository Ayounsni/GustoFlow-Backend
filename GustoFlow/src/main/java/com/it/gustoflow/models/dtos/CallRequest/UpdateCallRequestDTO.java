package com.it.gustoflow.models.dtos.CallRequest;

import com.it.gustoflow.models.enums.CallRequestStatus;
import com.it.gustoflow.models.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCallRequestDTO {

    private RequestType requestType; // Type de demande (HELP, ORDER, etc.)

    private CallRequestStatus status; // Statut de la demande (PENDING, RESOLVED)
}
