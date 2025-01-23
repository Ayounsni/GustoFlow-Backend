package com.it.gustoflow.security.mappers;


import com.it.gustoflow.security.dtos.AppUserDTO.CreateAppUserDTO;
import com.it.gustoflow.security.dtos.AppUserDTO.ResponseAppUserDTO;
import com.it.gustoflow.security.dtos.AppUserDTO.UpdateAppUserDTO;
import com.it.gustoflow.security.entities.AppUser;
import com.it.gustoflow.security.mappers.helpers.AppRoleMapperHelper;
import org.mapstruct.*;

@Mapper(componentModel = "spring",uses = {AppRoleMapperHelper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AppUserMapper {

    @Mapping(target = "role", source = "roleId")
    AppUser toEntity(CreateAppUserDTO createDTO);

    @Mapping(target = "role", source = "roleId")
    AppUser updateEntityFromDTO(UpdateAppUserDTO updateAppUserDTO, @MappingTarget AppUser entity);

    ResponseAppUserDTO toDTO(AppUser entity);
}
