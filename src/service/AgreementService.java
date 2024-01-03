package com.example.bankapp1.service;



import com.example.bankapp1.DTO.AgreementDTO;
import com.example.bankapp1.entities.Agreement;

import java.util.List;
import java.util.UUID;

public interface AgreementService {
    AgreementDTO getAgreementById(UUID id);

    AgreementDTO createNewAgreement(AgreementDTO agreementDTO);

    List<Agreement> getAllAgreements();

    boolean deleteAgreement(UUID uuid);
}
