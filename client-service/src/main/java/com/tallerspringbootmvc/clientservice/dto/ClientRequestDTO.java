package com.tallerspringbootmvc.clientservice.dto;

import lombok.Builder;

@Builder
public record ClientRequestDTO(
        Integer documentNumber,
        String phoneNumber,
        String email
) {
}
