package com.example.bankapp1.service.serviceImpl;


import com.example.bankapp1.DTO.AgreementDTO;
import com.example.bankapp1.entities.Agreement;
import com.example.bankapp1.mapper.AgreementMapper;
import com.example.bankapp1.repository.AgreementRepository;
import com.example.bankapp1.service.AgreementService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AgreementServiceImpl implements AgreementService {
    private final AgreementRepository agreementRepository;
    private final AgreementMapper agreementMapper;

    @Override
    public AgreementDTO getAgreementById(UUID id) {
        return agreementMapper.ToDTO(agreementRepository.getById(id));
    }

    @Override
    public AgreementDTO createNewAgreement(AgreementDTO agreementDTO) {
        return agreementMapper.ToDTO(agreementRepository.save(agreementMapper.ToEntity(agreementDTO)));
    }

    @Override
    public List<Agreement> getAllAgreements() {
        return agreementRepository.findAll();
    }

    @Override
    public boolean deleteAgreement(UUID uuid) {

        if (agreementRepository.existsById(uuid)) {
            agreementRepository.deleteById(uuid);
            return true;
        };
        return false;
}
}

