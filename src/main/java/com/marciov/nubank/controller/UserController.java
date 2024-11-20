package com.marciov.nubank.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marciov.nubank.controller.dto.CreateUserRequestDTO;
import com.marciov.nubank.controller.dto.CreateUserResponseDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {

    @PostMapping
    public ResponseEntity<CreateUserResponseDTO> createUser(
        @RequestBody @Valid CreateUserRequestDTO createUserRequestDTO
    ) {
        var response = new CreateUserResponseDTO(UUID.randomUUID());
        return ResponseEntity.ok(response);
    }
    
}
