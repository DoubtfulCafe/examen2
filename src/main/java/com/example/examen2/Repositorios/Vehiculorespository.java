package com.example.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.examen2.Modelos.Vehiculo;

public interface Vehiculorespository extends JpaRepository<Vehiculo, Integer> {
    
}
