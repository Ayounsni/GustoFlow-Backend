package com.it.gustoflow.controllers;

import com.it.gustoflow.models.dtos.Pagination.PageDTO;
import com.it.gustoflow.models.dtos.CallRequest.CreateCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.ResponseCallRequestDTO;
import com.it.gustoflow.models.dtos.CallRequest.UpdateCallRequestDTO;
import com.it.gustoflow.models.entities.CallRequest;
import com.it.gustoflow.services.implementation.CallRequestService;
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
@RequestMapping("/api/public/callRequest")
public class CallRequestController {
    @Autowired
    private CallRequestService callRequestService;

    @PostMapping
    public ResponseEntity<ResponseCallRequestDTO> createCallRequest(@Valid @RequestBody CreateCallRequestDTO createCallRequestDTO) {
        ResponseCallRequestDTO callRequest = callRequestService.create(createCallRequestDTO);
        return new ResponseEntity<>(callRequest, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseCallRequestDTO> getCallRequestById(@Exists(entity = CallRequest.class , message = "Cet callRequest n'existe pas.")  @PathVariable("id") Long id) {
            ResponseCallRequestDTO callRequest = callRequestService.findById(id);
            return new ResponseEntity<>(callRequest, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<PageDTO<ResponseCallRequestDTO>> getAllCallRequestsPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        PageDTO<ResponseCallRequestDTO> callRequests = callRequestService.findAll(page, size);
        return new ResponseEntity<>(callRequests, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ResponseCallRequestDTO>> getAllCallRequests() {
        List<ResponseCallRequestDTO> callRequests = callRequestService.findAll();
        return new ResponseEntity<>(callRequests, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCallRequest(@Exists(entity = CallRequest.class , message = "Cet callRequest n'existe pas.") @PathVariable("id") Long id) {
            callRequestService.deleteById(id);
            return new ResponseEntity<>("CallRequest est supprimé avec succès", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseCallRequestDTO> updateCallRequest(@Exists(entity = CallRequest.class , message = "Cet callRequest n'existe pas.") @PathVariable("id") Long id, @Valid @RequestBody UpdateCallRequestDTO updateCallRequestDTO) {

            ResponseCallRequestDTO updatedCallRequest = callRequestService.update(id, updateCallRequestDTO);
            return new ResponseEntity<>(updatedCallRequest, HttpStatus.OK);
    }


}
