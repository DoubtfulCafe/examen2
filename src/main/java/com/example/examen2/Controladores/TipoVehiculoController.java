package com.example.examen2.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen2.Modelos.TipoVehiculo;
import com.example.examen2.Modelos.TipoVehiculo;
import com.example.examen2.Servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/TipoVehiculo")
public class TipoVehiculoController {
    @Autowired
        private TipoVehiculoServiceImpl TipoVehiculoServiceImpl;

        @PostMapping("/guardar")
        public TipoVehiculo guardarTipoVehiculo(@RequestBody TipoVehiculo nvoTipoVehiculo){

        return this.TipoVehiculoServiceImpl.CrearTipoVehiculo(nvoTipoVehiculo);
        }
    }