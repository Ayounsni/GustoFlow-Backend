package com.it.gustoflow.models.entities;

import com.it.gustoflow.models.enums.CallRequestStatus;
import com.it.gustoflow.models.enums.RequestType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CallRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDateTime timestamp; // Horodatage de la demande

    @Enumerated(EnumType.STRING)
    private RequestType requestType; // Type de demande (HELP, ORDER, etc.)

    @Enumerated(EnumType.STRING)
    private CallRequestStatus status; // Statut de la demande (PENDING, RESOLVED)

    @ManyToOne
    private Table table; // Relation avec Table

}
