package com.example.bankapp1.Controller;


import com.example.bankapp1.DTO.ManagerDTO;
import com.example.bankapp1.service.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@AllArgsConstructor
@RestController // work with objekt
@RequestMapping("/managers") // links browser
public class ManagerController {
    private final ManagerService managerService;

    @GetMapping("/{id}")
    public ResponseEntity<ManagerDTO> getManagerById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(managerService.getManagerById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<ManagerDTO> createManager(@RequestBody ManagerDTO managerDTO) {
        return new ResponseEntity<>(managerService.createManager(managerDTO), HttpStatus.CREATED);
    }
    @DeleteMapping("/{string}")
    public void deleteManagerById(@PathVariable UUID uuid) {managerService. deleteManagerById(uuid);
    }
}
