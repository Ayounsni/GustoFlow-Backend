package com.it.gustoflow.services.interfaces;

import com.it.gustoflow.models.dtos.Table.CreateTableDTO;
import com.it.gustoflow.models.dtos.Table.ResponseTableDTO;
import com.it.gustoflow.models.dtos.Table.UpdateTableDTO;

public interface ITableService extends IGenericService<CreateTableDTO,UpdateTableDTO,ResponseTableDTO> {

}
