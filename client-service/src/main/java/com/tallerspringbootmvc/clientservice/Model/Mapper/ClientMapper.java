package com.tallerspringbootmvc.clientservice.Model.Mapper;

import com.tallerspringbootmvc.clientservice.Model.ClientEntity;
import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;

public interface ClientMapper {

    //DTO ---> Entity
    ClientEntity toEntity(ClientRequestDTO dto);

    //ENtity ---> DTO
    ClientResponseDTO toDTO(ClientEntity entity);

}
