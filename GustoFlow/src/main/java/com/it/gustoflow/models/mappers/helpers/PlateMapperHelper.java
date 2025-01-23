package com.it.gustoflow.models.mappers.helpers;

import com.it.gustoflow.models.entities.Plate;
import com.it.gustoflow.repository.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlateMapperHelper {

    @Autowired
    private PlateRepository plateRepository;

    public Plate mapPlateIdToPlate(Long plateId) {
        return plateRepository.findById(plateId).orElse(null);
    }
}
