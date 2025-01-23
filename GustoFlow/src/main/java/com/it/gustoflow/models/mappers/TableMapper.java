package com.it.gustoflow.models.mappers;

import com.it.gustoflow.models.dtos.Table.CreateTableDTO;
import com.it.gustoflow.models.dtos.Table.ResponseTableDTO;
import com.it.gustoflow.models.dtos.Table.UpdateTableDTO;
import com.it.gustoflow.models.entities.Table;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TableMapper extends GenericMapper<Table, CreateTableDTO, UpdateTableDTO,ResponseTableDTO> {



}
