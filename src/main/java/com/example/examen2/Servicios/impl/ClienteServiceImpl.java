package com.example.examen2.Servicios.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen2.Modelos.Cliente;
import com.example.examen2.Repositorios.ClienteRepository;
import com.example.examen2.Servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

        @Autowired
        private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> ObtenerTodosClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {

        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente ObtenerCliente(int id) {
        Cliente cliente = this.clienteRepository.findById(id).get();
        if(cliente != null){
           
            return cliente;
        }

        return null;

         
    }
}