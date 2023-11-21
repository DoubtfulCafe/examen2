package com.example.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen2.Modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
