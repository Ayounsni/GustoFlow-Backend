package com.it.gustoflow.services.implementation;

import com.it.gustoflow.models.entities.Table;
import com.it.gustoflow.models.mappers.TableMapper;
import com.it.gustoflow.models.dtos.Table.CreateTableDTO;
import com.it.gustoflow.models.dtos.Table.ResponseTableDTO;
import com.it.gustoflow.models.dtos.Table.UpdateTableDTO;
import com.it.gustoflow.repository.TableRepository;
import com.it.gustoflow.services.interfaces.ITableService;
import org.springframework.stereotype.Service;

@Service
public class TableService extends GenericService<Table,CreateTableDTO,UpdateTableDTO,ResponseTableDTO> implements ITableService {

    public TableService(TableRepository tableRepository, TableMapper tableMapper) {
        super(tableRepository, tableMapper);
    }

}
