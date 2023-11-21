package com.example.examen2.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen2.Modelos.Vehiculo;
import com.example.examen2.Servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/Vehiculo")
public class VehiculoController {

@Autowired
private VehiculoServiceImpl VehiculoServiceImpl;


@PostMapping("/guardar")
public Vehiculo guardarVehiculo(@RequestBody Vehiculo nvoVehiculo){

return this.VehiculoServiceImpl.guardarVehiculo(nvoVehiculo);
}

@GetMapping("/todos")
public List<Vehiculo> ObtenerTodosVehiculos(){
return this.VehiculoServiceImpl.ObtenerTodosVehiculos();
}
@GetMapping("/consultar")
public Vehiculo ObtenerVehiculo(@RequestParam(name="id") int id){

    return this.VehiculoServiceImpl.ObtenerVehiculo(id);
}
}
