package com.example.bankapp1.Controller;

import com.example.bankapp1.DTO.AgreementDTO;
import com.example.bankapp1.entities.Agreement;
import com.example.bankapp1.service.AgreementService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController // work with objekt
@RequestMapping("/agreements") // links browser
public class AgreementController {
    private final AgreementService agreementService;

    @GetMapping("/{id}")
    public ResponseEntity<AgreementDTO> getAgreementById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(agreementService.getAgreementById(id), HttpStatus.OK);
    }

    public ResponseEntity<AgreementDTO> createNewAgreement(@RequestBody AgreementDTO agreementDTO) {
        return new ResponseEntity<>(agreementService.createNewAgreement(agreementDTO), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Agreement>> getAllAgreements() {
        List<Agreement> agreements = agreementService.getAllAgreements();
        // Возвращаем список всех соглашений с кодом статуса 200 OK
        return new ResponseEntity<>(agreements, HttpStatus.OK);
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<Void> deleteAgreement(@PathVariable UUID uuid) {
        boolean deleted = agreementService.deleteAgreement(uuid);
        if (deleted) {
            // Возвращаем код статуса 204 No Content, что означает успешное удаление
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            // Если соглашение не найдено, возвращаем код статуса 404 Not Found
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}