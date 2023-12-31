package com.example.examen2.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen2.Modelos.Cliente;
import com.example.examen2.Servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

@Autowired
private ClienteServiceImpl clienteServiceImpl;


@PostMapping("/guardar")
public Cliente guardarCliente(@RequestBody Cliente nvoCliente){

return this.clienteServiceImpl.guardarCliente(nvoCliente);
}

@GetMapping("/todos")
public List<Cliente> ObtenerTodosClientes(){
return this.clienteServiceImpl.ObtenerTodosClientes();
}
@GetMapping("/consultar")
public Cliente ObtenerCliente(@RequestParam(name="id") int id){

    return this.clienteServiceImpl.ObtenerCliente(id);
}









}