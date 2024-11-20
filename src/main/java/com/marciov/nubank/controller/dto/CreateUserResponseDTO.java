package com.marciov.nubank.controller.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;

public record CreateUserResponseDTO(
    @Schema(description = "User ID", example = "123e4567-e89b-12d3-a456-426655440000")
    UUID id
) {

}
