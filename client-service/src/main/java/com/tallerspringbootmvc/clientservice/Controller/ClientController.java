package com.tallerspringbootmvc.clientservice.Controller;


import com.tallerspringbootmvc.clientservice.Constants.ClientConstants;
import com.tallerspringbootmvc.clientservice.Service.ClientService;
import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.tallerspringbootmvc.clientservice.Constants.ClientConstants.BASE_URI;

@RestController
@RequestMapping(value = BASE_URI)
@RequiredArgsConstructor //para que no pida constructores las inyecciones
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientResponseDTO> createClient(@RequestBody ClientRequestDTO requestDTO){
        ClientResponseDTO responseDTO = clientService.createClient(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    //    @PutMapping(value = "{clientId}")
//    public ResponseEntity<ClientResponseDTO> updateClientById(
//            @PathVariable String clientId, @RequestBody ClientRequestDTO requestDTO
//    ) {
//        ClientResponseDTO responseDTO = new ClientResponseDTO();
//        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
//    }


//    @GetMapping(value = "/{clientId}")
//    public ResponseEntity<?> getClientById(@PathVariable String clientId) {
//        // llamado al método para obtener un cliente en el service
//        ClientResponseDTO responseDTO = new ClientResponseDTO();
//
//        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
//    }
//
//    @DeleteMapping(value = "/{clientId}")
//    public ResponseEntity<Void> deleteClientById(@PathVariable String clientId) {
//        // llamado al método para obtener un cliente en el service
//
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
}
