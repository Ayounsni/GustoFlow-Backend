package com.it.gustoflow.models.dtos.Table;

import com.it.gustoflow.models.enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@AllArgsConstructor
public class CreateTableDTO {

    private int secretCode; // Code secret de la table

    private TableStatus tableStatus = TableStatus.AVAILABLE; // Statut de la table (par défaut : AVAILABLE)

    // Génère le code secret automatiquement si nécessaire
    public CreateTableDTO() {
        this.secretCode = generateSecretCode();
    }

    private int generateSecretCode() {
        return 1000 + new Random().nextInt(9000); // Génère un nombre entre 1000 et 9999
    }
}
