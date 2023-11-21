package com.example.examen2.Servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen2.Modelos.Vehiculo;
import com.example.examen2.Repositorios.Vehiculorespository;
import com.example.examen2.Servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{
         @Autowired
        private Vehiculorespository vehiculorespository;
    @Override
    public List<Vehiculo> ObtenerTodosVehiculos() {
        return this.vehiculorespository.findAll();
        
        
    }

    @Override
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return this.vehiculorespository.save(vehiculo);

        
    }

    @Override
    public Vehiculo ObtenerVehiculo(int id) {
         Vehiculo vehiculo = this.vehiculorespository.findById(id).get();
        if(vehiculo != null){
           
            return vehiculo;
        }

        return null;

    }
    
}
