package com.tallerspringbootmvc.clientservice.Model.Mapper;

import com.tallerspringbootmvc.clientservice.Model.ClientEntity;
import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;

public class ClientMapperImpl implements ClientMapper{
    @Override
    public ClientEntity toEntity(ClientRequestDTO dto) {
        return ClientEntity.builder()
                .documentNumber(dto.documentNumber())
                .phoneNumber(dto.phoneNumber())
                .email(dto.email())
                .build();
    }

    @Override
    public ClientResponseDTO toDTO(ClientEntity entity) {
        return ClientResponseDTO.builder()
                .clientId(entity.getId())
                .documentNumber(entity.getDocumentNumber())
                .phoneNumber(entity.getPhoneNumber())
                .email(entity.getEmail())
                .build();
    }
}
