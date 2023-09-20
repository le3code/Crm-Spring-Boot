package com.ultima.crm.controller;

import com.ultima.crm.model.Cliente;
import com.ultima.crm.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/getCliente{id}")
    public ResponseEntity<Optional<Cliente>> getClienteById(@PathVariable int id) {

        Optional<Cliente> clienteOptional = clienteService.findCliente(id);

        return ResponseEntity.ok(clienteOptional);
    }

    @GetMapping("/getAllClientes")
    public ResponseEntity<List<Cliente>> getAllCliente() {
        return ResponseEntity.ok(clienteService.getAllClientes().get());
    }






}
