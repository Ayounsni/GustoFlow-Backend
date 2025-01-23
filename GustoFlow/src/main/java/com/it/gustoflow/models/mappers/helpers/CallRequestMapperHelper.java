package com.it.gustoflow.models.mappers.helpers;

import com.it.gustoflow.models.entities.CallRequest;
import com.it.gustoflow.repository.CallRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CallRequestMapperHelper {

    @Autowired
    private CallRequestRepository callRequestRepository;

    public CallRequest mapCallRequestIdToCallRequest(Long callRequestId) {
        return callRequestRepository.findById(callRequestId).orElse(null);
    }
}
