package com.it.gustoflow.services.interfaces;

import com.it.gustoflow.models.dtos.CallRequest.CreateCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.ResponseCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.UpdateCallRequestDTO;

public interface ICallRequestService extends IGenericService<CreateCallRequestDTO,UpdateCallRequestDTO,ResponseCallRequestDTO> {

}
