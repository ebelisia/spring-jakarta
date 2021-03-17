package com.jakarta.spring.springjakarta.domain.service;

import com.jakarta.spring.springjakarta.domain.model.Cliente;
import com.jakarta.spring.springjakarta.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }


}
