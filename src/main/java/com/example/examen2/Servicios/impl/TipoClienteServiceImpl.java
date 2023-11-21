package com.example.examen2.Servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen2.Modelos.TipoCliente;

import com.example.examen2.Repositorios.TipoClienteRepository;
import com.example.examen2.Servicios.TipoClienteService;
@Service
public class TipoClienteServiceImpl implements TipoClienteService {
    @Autowired
        private TipoClienteRepository tipoClienteRepository;


    @Override
    public TipoCliente CrearTipoCliente(TipoCliente tipoCliente) {
        return this.tipoClienteRepository.save(tipoCliente);

       
    }
    
}
