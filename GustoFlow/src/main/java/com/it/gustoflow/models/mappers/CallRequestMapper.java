package com.it.gustoflow.models.mappers;

import com.it.gustoflow.models.dtos.CallRequest.CreateCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.ResponseCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.UpdateCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.CreateCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.ResponseCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.UpdateCallRequestDTO;
import com.it.gustoflow.models.entities.CallRequest;
import com.it.gustoflow.models.entities.CallRequest;
import com.it.gustoflow.models.mappers.helpers.CallRequestMapperHelper;
import com.it.gustoflow.models.mappers.helpers.TableMapperHelper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",uses = {TableMapperHelper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CallRequestMapper extends GenericMapper<CallRequest, CreateCallRequestDTO, UpdateCallRequestDTO,ResponseCallRequestDTO> {

    @Override
    @Mapping(target = "table", source = "tableId")
    CallRequest toEntity(CreateCallRequestDTO createCallRequestDTO);

    @Override
    CallRequest updateEntityFromDTO(UpdateCallRequestDTO updateDTO, @MappingTarget CallRequest entity);

    @Override
    @Mapping(target = "table", source = "table")
    ResponseCallRequestDTO toDTO(CallRequest question);

}
