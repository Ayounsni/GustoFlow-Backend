package com.it.gustoflow.models.entities;

import com.it.gustoflow.models.enums.TableStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
//@Table(name = "restaurant_table")
@jakarta.persistence.Table(name = "restaurant_table")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer number;

    @NotNull
    private Integer secretCode;

    @Enumerated(EnumType.STRING)
    private TableStatus tableStatus; // Relation avec le statut de la table (disponible/occupée)

    @OneToMany(mappedBy = "table", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<CallRequest> calls ;

    private static int counter = 1;

    @PrePersist
    public void generateNumber() {
        this.number = counter++;
    }
}
