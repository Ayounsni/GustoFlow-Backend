package com.it.gustoflow.models.mappers.helpers;

import com.it.gustoflow.models.entities.Table;
import com.it.gustoflow.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TableMapperHelper {

    @Autowired
    private TableRepository tableRepository;

    public Table mapTableIdToTable(Long tableId) {
        return tableRepository.findById(tableId).orElse(null);
    }
}
