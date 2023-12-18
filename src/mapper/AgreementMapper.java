package com.example.bankapp1.mapper;

import com.example.bankapp1.DTO.AgreementDTO;
import com.example.bankapp1.entities.Agreement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface AgreementMapper {
    @Named("toDto")
    AgreementDTO ToDTO(Agreement agreement);
    @Mapping(source = "id", target = "id")
    Agreement ToEntity (AgreementDTO agreementDTO);

}
