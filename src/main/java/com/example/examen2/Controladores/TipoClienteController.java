package com.example.examen2.Controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen2.Modelos.TipoCliente;
import com.example.examen2.Modelos.TipoCliente;
import com.example.examen2.Servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/TipoCliente")
public class TipoClienteController {
    @Autowired
        private TipoClienteServiceImpl TipoClienteServiceImpl;

        @PostMapping("/guardar")
        public TipoCliente guardarTipoCliente(@RequestBody TipoCliente nvoTipoCliente){

        return this.TipoClienteServiceImpl.CrearTipoCliente(nvoTipoCliente);
        }
    
}
