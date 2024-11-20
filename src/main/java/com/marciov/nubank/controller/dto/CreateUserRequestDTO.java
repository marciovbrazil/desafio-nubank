package com.marciov.nubank.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record CreateUserRequestDTO(
        @Schema(description = "User name", example = "John Doe", requiredMode = Schema.RequiredMode.REQUIRED) 
        @NotEmpty
        String name,
        
        @NotEmpty
        @Email
        @Schema(description = "User e-mail", example = "john.doe@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED) 
        String email
    ) {
}
