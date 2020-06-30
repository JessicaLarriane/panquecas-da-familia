package com.luis.pereira.panquecasdafamilia.controller;

import com.luis.pereira.panquecasdafamilia.model.ClientEntity;
import com.luis.pereira.panquecasdafamilia.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    //customer listing
    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll(){
        return new ResponseEntity<List<ClientEntity>>(
                (List<ClientEntity>) this.clientRepository.findAll(), new HttpHeaders(), HttpStatus.OK);
    }
}
