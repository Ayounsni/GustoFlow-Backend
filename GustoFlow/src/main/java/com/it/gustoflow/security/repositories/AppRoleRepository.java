package com.it.gustoflow.security.repositories;

import com.it.gustoflow.security.entities.AppRole;
import com.it.gustoflow.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
}
