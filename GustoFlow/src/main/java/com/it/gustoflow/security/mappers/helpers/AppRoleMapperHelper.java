package com.it.gustoflow.security.mappers.helpers;

import com.it.gustoflow.security.entities.AppRole;
import com.it.gustoflow.security.repositories.AppRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppRoleMapperHelper {

    @Autowired
    private AppRoleRepository appRoleRepository;

    public AppRole mapAppRoleIdToAppRole(Long appRoleId) {
        return appRoleRepository.findById(appRoleId).orElse(null);
    }
}

