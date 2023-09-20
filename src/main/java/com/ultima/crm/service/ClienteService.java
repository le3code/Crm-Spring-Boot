package com.ultima.crm.service;

import com.ultima.crm.model.Cliente;
import com.ultima.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Optional<Cliente> findCliente(int id){

        return clienteRepository.findById(id);
    }

    public Optional<List<Cliente>> getAllClientes (){
        return Optional.of(clienteRepository.findAll());
    }


}
