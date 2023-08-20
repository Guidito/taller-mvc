package com.tallerspringbootmvc.clientservice.Service;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;

public interface ClientService {

    ClientResponseDTO createClient(ClientRequestDTO requestDTO);

}
