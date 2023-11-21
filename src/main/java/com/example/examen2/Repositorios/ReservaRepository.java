package com.example.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.examen2.Modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>  {
    
}
