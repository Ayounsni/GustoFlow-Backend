package com.it.gustoflow.security.dtos.AppUserDTO;

import com.it.gustoflow.security.dtos.AppRoleDTO.EmbeddableAppRoleDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAppUserDTO {

    private String id;

    private String username;

    private String email;

    private EmbeddableAppRoleDTO role;
}
