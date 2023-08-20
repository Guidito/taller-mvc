package com.tallerspringbootmvc.clientservice.Service;

import com.tallerspringbootmvc.clientservice.Model.Mapper.ClientMapperImpl;
import com.tallerspringbootmvc.clientservice.Repository.ClientRepository;
import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor //para que no pida constructores en las inyacciones de repository y del mapper
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;
    private final ClientMapperImpl clientMapper;

    @Override
    public ClientResponseDTO createClient(ClientRequestDTO requestDTO) {
        if(Objects.isNull(requestDTO)){
            throw new RuntimeException("La request no puede contener un objeto vació.");
        }

        ClientEntity client = clientMapper.toEntity(requestDTO);
        client = clientRepository.save(client);

        return clientMapper.toDTO(client);
    }
}
