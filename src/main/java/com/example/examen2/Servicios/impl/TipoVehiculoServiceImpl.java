package com.example.examen2.Servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen2.Modelos.TipoVehiculo;
import com.example.examen2.Repositorios.TipoVehiculoRepository;
import com.example.examen2.Servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
        private TipoVehiculoRepository tipoVehiculoRepository;


    @Override
    public TipoVehiculo CrearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);

       
    }


   
    
}
