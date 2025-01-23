package com.it.gustoflow.controllers;

import com.it.gustoflow.models.dtos.Pagination.PageDTO;
import com.it.gustoflow.models.dtos.Table.CreateTableDTO;
import com.it.gustoflow.models.dtos.Table.ResponseTableDTO;
import com.it.gustoflow.models.dtos.Table.UpdateTableDTO;
import com.it.gustoflow.models.entities.Table;
import com.it.gustoflow.services.implementation.TableService;
import com.it.gustoflow.validation.annotations.Exists;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api/public/table")
public class TableController {
    @Autowired
    private TableService tableService;

    @PostMapping
    public ResponseEntity<ResponseTableDTO> createTable(@Valid @RequestBody CreateTableDTO createTableDTO) {
        ResponseTableDTO table = tableService.create(createTableDTO);
        return new ResponseEntity<>(table, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseTableDTO> getTableById(@Exists(entity = Table.class , message = "Cet table n'existe pas.")  @PathVariable("id") Long id) {
            ResponseTableDTO table = tableService.findById(id);
            return new ResponseEntity<>(table, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<PageDTO<ResponseTableDTO>> getAllTablesPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        PageDTO<ResponseTableDTO> tables = tableService.findAll(page, size);
        return new ResponseEntity<>(tables, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ResponseTableDTO>> getAllTables() {
        List<ResponseTableDTO> tables = tableService.findAll();
        return new ResponseEntity<>(tables, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTable(@Exists(entity = Table.class , message = "Cet table n'existe pas.") @PathVariable("id") Long id) {
            tableService.deleteById(id);
            return new ResponseEntity<>("Table est supprimé avec succès", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseTableDTO> updateTable(@Exists(entity = Table.class , message = "Cet table n'existe pas.") @PathVariable("id") Long id, @Valid @RequestBody UpdateTableDTO updateTableDTO) {

            ResponseTableDTO updatedTable = tableService.update(id, updateTableDTO);
            return new ResponseEntity<>(updatedTable, HttpStatus.OK);
    }


}
