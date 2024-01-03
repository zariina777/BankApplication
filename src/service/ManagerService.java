package com.example.bankapp1.service;



import com.example.bankapp1.DTO.ManagerDTO;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.UUID;

public interface ManagerService {
    ManagerDTO getManagerById(UUID id) throws ChangeSetPersister.NotFoundException;

    ManagerDTO createManager(ManagerDTO managerDTO);

    void deleteManagerById(UUID uuid);
}
