package com.example.examen2.Servicios;

import java.util.List;

import com.example.examen2.Modelos.Vehiculo;

public interface VehiculoService {
    public List<Vehiculo> ObtenerTodosVehiculos(); 

    
    

    public Vehiculo guardarVehiculo(Vehiculo vehiculo);

    public Vehiculo ObtenerVehiculo(int id);

    
}
