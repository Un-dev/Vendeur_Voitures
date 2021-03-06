package com.phransswa.controller;

import com.phransswa.entity.Client;
import com.phransswa.repository.ClientsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @Autowired
    private ClientsRepo clientsRepo;

    @GetMapping("/")
    public List<Client> getClients(){
        return clientsRepo.findAll();
    }

    @GetMapping("/{clientId}")
    public Optional<Client> getClient(@PathVariable("clientId") int clientId){
        return clientsRepo.findById(clientId);
    }

    @DeleteMapping("/{clientId}")
    public void  deleteClient(@PathVariable("clientId") int clientId) {
        clientsRepo.deleteById(clientId);
    }

    @PostMapping("/")
    public void postClient(@RequestBody Client client) {
        clientsRepo.save(client);
    }

    @PutMapping("/{clientId}")
    public Client updateClient(@PathVariable("clientId") int clientId, @RequestBody Client newClient){
        return clientsRepo.findById(clientId)
                .map(client -> {
                    client.setName(newClient.getName());
                    return clientsRepo.save(client);
                })
                .orElseGet(() -> {
                    newClient.setId(clientId);
                    return clientsRepo.save(newClient);
                });
    }

}