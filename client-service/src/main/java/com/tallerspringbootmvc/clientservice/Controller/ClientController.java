package com.tallerspringbootmvc.clientservice.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/clients")
public class ClientController {

    /*@PostMapping
    public ResponseEntity<Void> createClient(@RequestBody ClientDTO requestDto){
        repository.saveClient(requestDto);
        ClientResponseDTO responseDto = new ClientResponseDTO();
        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }*/

    @PostMapping
    public ResponseEntity<ClientResponseDTO> createClient(ClientRequestDTO requestDto){
        //logica para la creacion
        ClientResponseDTO responseDto = new ClientResponseDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @DeleteMapping(value = "/{clientId}")
    public ResponseEntity<Void> deleteClientById(@PathVariable String clientId){
        //llamado al metodo para obtener un cliente en el service

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
