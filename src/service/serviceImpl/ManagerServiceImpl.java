package com.example.bankapp1.service.serviceImpl;


import com.example.bankapp1.DTO.ManagerDTO;
import com.example.bankapp1.entities.Manager;
import com.example.bankapp1.mapper.ManagerMapper;
import com.example.bankapp1.repository.ManagerRepository;
import com.example.bankapp1.service.ManagerService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    @Override
    public ManagerDTO getManagerById(UUID id) throws ChangeSetPersister.NotFoundException {

        Manager manager = managerRepository.findById(String.valueOf(id)).orElseThrow(ChangeSetPersister.NotFoundException::new);
        return managerMapper.ToDTO(manager);
    }

    @Override
    public ManagerDTO createManager(ManagerDTO managerDTO) {
        return managerMapper.ToDTO(managerRepository.save(managerMapper.ToEntity(managerDTO)));
    }

    @Override
    public void deleteManagerById(UUID uuid) {
        try {
            managerRepository.deleteById(String.valueOf(uuid));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
