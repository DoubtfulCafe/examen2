package com.example.examen2.Servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.examen2.Modelos.Cliente;
import com.example.examen2.Modelos.Reserva;
import com.example.examen2.Modelos.Vehiculo;
import com.example.examen2.Repositorios.ClienteRepository;
import com.example.examen2.Repositorios.ReservaRepository;
import com.example.examen2.Repositorios.Vehiculorespository;

public class ReservacionServiceimpl {
      @Autowired
    private ClienteRepository clienteRepository;
     @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private Vehiculorespository vehiculoRepository;

    
    public String crearReserva(int codigoCliente, int codigoVehiculo, int cantidadDias) {
        // Buscar cliente y vehículo
        Cliente cliente = clienteRepository.findById(codigoCliente).orElse(null);
        Vehiculo vehiculo = vehiculoRepository.findById(codigoVehiculo).orElse(null);

        if (cliente == null || vehiculo == null) {
            return "Cliente o vehículo no encontrado.";
        }

        // Verificar la disponibilidad del vehículo
        if (!vehiculo.isDisponible()) {
            return "El vehículo ya se encuentra rentado.";
        }
        return null;

       //no lo termine
    }
    
}
