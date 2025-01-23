package com.it.gustoflow.services.implementation;

import com.it.gustoflow.models.dtos.Plate.CreatePlateDTO;
import com.it.gustoflow.models.dtos.Plate.ResponsePlateDTO;
import com.it.gustoflow.models.dtos.Plate.UpdatePlateDTO;
import com.it.gustoflow.models.entities.Plate;
import com.it.gustoflow.models.mappers.PlateMapper;
import com.it.gustoflow.repository.PlateRepository;
import com.it.gustoflow.services.interfaces.IPlateService;
import org.springframework.stereotype.Service;

@Service
public class PlateService extends GenericService<Plate,CreatePlateDTO,UpdatePlateDTO,ResponsePlateDTO> implements IPlateService {

    public PlateService(PlateRepository plateRepository, PlateMapper plateMapper) {
        super(plateRepository, plateMapper);
    }

}
