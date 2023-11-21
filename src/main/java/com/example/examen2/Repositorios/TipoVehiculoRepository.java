package com.example.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.examen2.Modelos.TipoVehiculo;

public interface TipoVehiculoRepository  extends JpaRepository<TipoVehiculo, Integer>{
    
}
