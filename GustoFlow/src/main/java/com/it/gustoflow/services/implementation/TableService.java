package com.it.gustoflow.services.implementation;

import com.it.gustoflow.models.dtos.Table.CodeSecretDTO;
import com.it.gustoflow.models.entities.Table;
import com.it.gustoflow.models.mappers.TableMapper;
import com.it.gustoflow.models.dtos.Table.CreateTableDTO;
import com.it.gustoflow.models.dtos.Table.ResponseTableDTO;
import com.it.gustoflow.models.dtos.Table.UpdateTableDTO;
import com.it.gustoflow.repository.TableRepository;
import com.it.gustoflow.services.interfaces.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Random;

@Service
public class TableService extends GenericService<Table,CreateTableDTO,UpdateTableDTO,ResponseTableDTO> implements ITableService {

    @Autowired
    TableRepository tableRepository;
    @Autowired
    TableMapper tableMapper;

    public TableService(TableRepository tableRepository, TableMapper tableMapper) {
        super(tableRepository, tableMapper);
    }

    @Override
    public ResponseTableDTO generateSecretCode(Long id){
        Table table = tableRepository.findById(id).orElseThrow();
        int secretCode = 1000 + new Random().nextInt(9000);
        table.setSecretCode(secretCode);
        Table table1 = tableRepository.save(table);
        return tableMapper.toDTO(table1);
    }

    @Override
    public boolean verifySecretCode(Long id, CodeSecretDTO codeSecretDTO){
        Table table = tableRepository.findById(id).orElseThrow();
        return Objects.equals(table.getSecretCode(), codeSecretDTO.getSecretCode());
    }

}
