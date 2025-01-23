package com.it.gustoflow.repository;

import com.it.gustoflow.models.entities.CallRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallRequestRepository extends JpaRepository<CallRequest, Long> {
}
