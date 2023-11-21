package com.example.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.examen2.Modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
