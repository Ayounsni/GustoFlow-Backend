package com.it.gustoflow.services.implementation;

import com.it.gustoflow.models.dtos.CallRequest.CreateCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.ResponseCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.UpdateCallRequestDTO;
import com.it.gustoflow.models.entities.CallRequest;
import com.it.gustoflow.models.mappers.CallRequestMapper;
import com.it.gustoflow.repository.CallRequestRepository;
import com.it.gustoflow.services.interfaces.ICallRequestService;
import org.springframework.stereotype.Service;

@Service
public class CallRequestService extends GenericService<CallRequest,CreateCallRequestDTO,UpdateCallRequestDTO,ResponseCallRequestDTO> implements ICallRequestService {

    public CallRequestService(CallRequestRepository callRequestRepository, CallRequestMapper callRequestMapper) {
        super(callRequestRepository, callRequestMapper);
    }

}
